/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MapperModel;

import Model.Brand;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Function;

/**
 *
 * @author hp
 */
public class BrandMapper {

    Function<ResultSet, Brand> mapFunction = rs -> {
        try {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            return new Brand(id, name);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    };

    public BrandMapper() {
    }

    public Function<ResultSet, Brand> getMapFunction() {
        return mapFunction;
    }

}
