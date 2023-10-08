/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Repository;

import DAL.DBContext;
import DAL.Repository.Interface.IBaseRepository;
import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author hp
 * @param <T>
 */
public class BaseRepository<T> extends DBContext implements IBaseRepository<T> {

    public BaseRepository() {
        super();
    }

    @Override
    public <T> List<T> getAll(String tableName, Function<ResultSet, T> mapFunction) {
        List<T> getAll = new ArrayList<>();
        String sql = "SELECT * FROM " + tableName;
        try ( PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                T object = mapFunction.apply(rs);
                getAll.add(object);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getAll;
    }

    @Override
    public <T> T find(String tableName, String condition, Function<ResultSet, T> mapFunction) {
        T result = null;
        String sql = "SELECT * FROM " + tableName + " WHERE " + condition;
        try ( PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = mapFunction.apply(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean update(String tableName, T entity, String condition) {
        Class<?> clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder sqlBuilder = new StringBuilder("UPDATE " + tableName + " SET ");
        List<String> identityColumns = Arrays.asList("id", "customerId", "order_id");

        for (Field field : fields) {
            String columnName = field.getName();
            field.setAccessible(true);
            if (!identityColumns.contains(columnName)) {
                try {
                    Object value = field.get(entity);
                    sqlBuilder.append(columnName).append(" = ?,");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        sqlBuilder.deleteCharAt(sqlBuilder.length() - 1);
        sqlBuilder.append(" WHERE ").append(condition);

        String sql = sqlBuilder.toString();

        try ( PreparedStatement ps = connection.prepareStatement(sql)) {
            int parameterIndex = 1;
            for (Field field : fields) {
                field.setAccessible(true);
                String columnName = field.getName();
                if (!identityColumns.contains(columnName)) {
                    Object value = field.get(entity);
                    ps.setObject(parameterIndex++, value);
                }
            }

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException | IllegalAccessException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(String tableName, String condition, Function<ResultSet, T> mapFunction) {
        String sql = "DELETE FROM " + tableName + " WHERE " + condition;
        try ( PreparedStatement ps = connection.prepareStatement(sql)) {
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean create(String tableName, T entity) {
        Class<?> clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder sqlBuilder = new StringBuilder("INSERT INTO " + tableName + " (");
        StringBuilder valuesBuilder = new StringBuilder(") VALUES (");

        for (Field field : fields) {
            String columnName = field.getName();
            field.setAccessible(true);
            if (!columnName.equalsIgnoreCase("id") && !columnName.equalsIgnoreCase("customerId") && !columnName.equalsIgnoreCase("order_id")) {
                try {
                    Object value = field.get(entity);
                    sqlBuilder.append(columnName).append(",");
                    valuesBuilder.append("?,");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        sqlBuilder.deleteCharAt(sqlBuilder.length() - 1);
        valuesBuilder.deleteCharAt(valuesBuilder.length() - 1);
        sqlBuilder.append(valuesBuilder).append(")");

        String sql = sqlBuilder.toString();

        try ( PreparedStatement ps = connection.prepareStatement(sql)) {
            int parameterIndex = 1;
            for (Field field : fields) {
                field.setAccessible(true);
                String columnName = field.getName();
                if (!columnName.equalsIgnoreCase("id") && !columnName.equalsIgnoreCase("customerId") && !columnName.equalsIgnoreCase("order_id")) {
                    Object value = field.get(entity);
                    ps.setObject(parameterIndex++, value);
                }
            }

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException | IllegalAccessException e) {
            e.printStackTrace();
            return false;
        }
    }

}
