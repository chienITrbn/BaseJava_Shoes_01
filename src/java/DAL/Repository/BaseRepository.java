/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Repository;

import DAL.DBContext;
import DAL.Repository.Interface.IBaseRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

}
