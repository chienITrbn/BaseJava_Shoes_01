/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MapperModel;

import Model.Category;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Function;

/**
 *
 * @author hp
 */
public class CategoryMapper {

    Function<ResultSet, Category> mapFunction = rs -> {
        try {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            return new Category(id, name);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    };

    public CategoryMapper() {
    }

    public Function<ResultSet, Category> getMapFunction() {
        return mapFunction;
    }
    
    
}
