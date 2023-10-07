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
 */
public interface IBaseRepository<T> {

    public <T> List<T> getAll(String tableName, Function<ResultSet, T> mapFunction);

    public <T> T find(String tableName, String condition, Function<ResultSet, T> mapFunction);
}
