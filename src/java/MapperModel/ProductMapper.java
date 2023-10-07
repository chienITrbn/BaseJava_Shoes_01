/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MapperModel;

import Model.Product;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Function;

/**
 *
 * @author hp
 */
public class ProductMapper {
    
    Function<ResultSet, Product> mapFunction = rs -> {
        try {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String description = rs.getString("description");
            int category_id = rs.getInt("category_id");
            double price = rs.getDouble("price");
            int brand_id = rs.getInt("brand_id");
            String image = rs.getString("image");
            Date created_at = rs.getDate("created_at");
            Date updated_at = rs.getDate("updated_at");
            return new Product(id, name, description, category_id, price, brand_id, image, created_at, updated_at);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    };

    public ProductMapper() {
    }

    public Function<ResultSet, Product> getMapFunction() {
        return mapFunction;
    }
    
    
}
