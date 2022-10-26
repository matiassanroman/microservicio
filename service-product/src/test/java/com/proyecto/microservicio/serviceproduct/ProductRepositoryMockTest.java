package com.proyecto.microservicio.serviceproduct;

import com.proyecto.microservicio.serviceproduct.entity.Category;
import com.proyecto.microservicio.serviceproduct.entity.Product;
import com.proyecto.microservicio.serviceproduct.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindByCategory_thenResultListProduct(){

        Product product = Product.builder()
                .name("shoes men/women")
                .category(Category.builder().id(1L).build())
                .description("")
                .price(Double.parseDouble("1240.99"))
                .createAt(new Date()).build();

        productRepository.save(product);

        List<Product> founds = productRepository.findByCategory(product.getCategory());

        Assertions.assertEquals(founds.size(), 3);


    }

}
