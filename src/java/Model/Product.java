/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Timestamp;

/**
 *
 * PRJ 301 _ Shoes_01
 */
public class Product {

    private int id;
    private String name;
    private String description;
    private int category_id;
    private double price;
    private int brand_id;
    private String image;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Product() {
    }

    public Product(int id, String name, String description, int category_id, double price, int brand_id, String image, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category_id = category_id;
        this.price = price;
        this.brand_id = brand_id;
        this.image = image;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
//
//    public Product(String name, String description, int category_id, double price, int brand_id, String image, Timestamp created_at, Timestamp updated_at) {
//
//        this.name = name;
//        this.description = description;
//        this.category_id = category_id;
//        this.price = price;
//        this.brand_id = brand_id;
//        this.image = image;
//        this.created_at = created_at;
//        this.updated_at = updated_at;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", description=" + description + ", category_id=" + category_id + ", price=" + price + ", brand_id=" + brand_id + ", image=" + image + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }

}
