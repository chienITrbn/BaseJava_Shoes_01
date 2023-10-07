/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DAL.Repository.CategoryRepository;
import DAL.Repository.Interface.ICategoryRepository;
import DAL.Repository.Interface.IProductRepository;
import DAL.Repository.ProductRepository;
import MapperModel.CategoryMapper;
import MapperModel.ProductMapper;
import Model.Category;
import Model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author hp
 */
public class TestRepository {

    private ICategoryRepository categoryRepository;
    private IProductRepository productRepository;

    public TestRepository(ICategoryRepository categoryRepository, IProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    public TestRepository() {
    }

    public void testGetAllCat() {
        CategoryMapper categoryMapper = new CategoryMapper();
        System.out.println(productRepository.getAll("category", categoryMapper.getMapFunction()));
    }

    public void testGetAllProduct() {
        ProductMapper productMapper = new ProductMapper();
        System.out.println(productRepository.getAll("product", productMapper.getMapFunction()));
    }

    public Product testFind(int id) {
        ProductMapper productMapper = new ProductMapper();

        return productRepository.find("product", "id=" + id, productMapper.getMapFunction());
    }

    public static void main(String[] args) {
//        IProductRepository productRepository = new ProductRepository();

        // Tạo một đối tượng IProductRepository (chẳng hạn là ProductRepository)
//        ICategoryRepository categorytRepository = new CategoryRepository();
//
//        // Tạo một đối tượng TestRepository và truyền vào IProductRepository
//        TestRepository t = new TestRepository(productRepository);
//        TestRepository t = new TestRepository(categorytRepository, productRepository);
//        System.out.println(t.testFind(1));
//        // Thực hiện kiểm tra hàm getAll
//        t.testGetAllProduct();
//        t.testGetAllCat();
    }
}
