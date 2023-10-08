/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Repository.Interface;

import java.sql.ResultSet;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author hp
 * @param <T>
 */
public interface IBaseRepository<T> {

    public <T> List<T> getAll(String tableName, Function<ResultSet, T> mapFunction);

    public <T> T find(String tableName, String condition, Function<ResultSet, T> mapFunction);
    
    public boolean create(String tableName, T entity);

    public boolean update(String tableName, T entity, String condition);

    public boolean delete(String tableName, String condition, Function<ResultSet, T> mapFunction);
}
