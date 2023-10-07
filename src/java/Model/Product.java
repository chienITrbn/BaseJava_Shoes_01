/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * PRJ 301 _ Shoes_01
 */
public class Product {
    private int id;
    private String name;
    private int category_id;
    private double price;
    private int brand_id;
    private String image;
    private Date created_at;
    private Date updated_at;

    public Product() {
    }

    public Product(int id, String name, int category_id, double price, int brand_id, String image, Date created_at, Date updated_at) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
        this.price = price;
        this.brand_id = brand_id;
        this.image = image;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", category_id=" + category_id + ", price=" + price + ", brand_id=" + brand_id + ", image=" + image + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }


    
    
}
