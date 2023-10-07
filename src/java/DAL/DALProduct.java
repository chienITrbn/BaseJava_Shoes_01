/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.Product;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class DALProduct extends DBContext {

    public List<Product> getAllListProduct() {
        List<Product> getAll = new ArrayList<>();
        String sql = "SELECT * FROM Product";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int category_id = rs.getInt("category_id");
                double price = rs.getDouble("price");
                int brand_id = rs.getInt("brand_id");
                String image = rs.getString("image");
                Date created_at = rs.getDate("created_at");
                Date updated_at = rs.getDate("updated_at");

                Product p = new Product(id, name, category_id, price, brand_id, image, created_at, updated_at);
                getAll.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return getAll;
    }

//    public static void main(String[] args) {
//        DALProduct dl = new DALProduct();
//        List<Product> test = dl.getAllListProduct();
//        System.out.println(test);
//    }
}
