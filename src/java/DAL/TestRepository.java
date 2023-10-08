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
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
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

    public boolean testCreateProduct(Product product) {
        return productRepository.create("product", product);
    }

    public boolean testCreateCate(Category category) {
        return categoryRepository.create("category", category);
    }

    public boolean testUpdateCate(Category categoryToUpdate,String id) {
        return categoryRepository.update("Category", categoryToUpdate, "id = " + id);
    }

    public static void main(String[] args) {
        IProductRepository productRepository = new ProductRepository();

        // Tạo một đối tượng IProductRepository (chẳng hạn là ProductRepository)
        ICategoryRepository categorytRepository = new CategoryRepository();
        Category c_test = new Category(0, "broo");
        Product test = new Product(0, "asd", "dasd", 1, 2, 1, "test", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()));
//      
//        // Tạo một đối tượng TestRepository và truyền vào IProductRepository
//        TestRepository t = new TestRepository(productRepository);
        TestRepository t = new TestRepository(categorytRepository, productRepository);
        t.testUpdateCate(c_test,"3");
//        t.testCreateProduct(test);
//        System.out.println(t.testFind(1));
//        // Thực hiện kiểm tra hàm getAll
//        t.testGetAllProduct();
//        t.testGetAllCat();
    }
}
