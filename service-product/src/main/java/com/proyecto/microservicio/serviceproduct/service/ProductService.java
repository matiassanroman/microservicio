package com.proyecto.microservicio.serviceproduct.service;

import com.proyecto.microservicio.serviceproduct.entity.Category;
import com.proyecto.microservicio.serviceproduct.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> listAllProduct();
    public Product getProduct(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public  Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updatePrice(Long id, Double price);

}
