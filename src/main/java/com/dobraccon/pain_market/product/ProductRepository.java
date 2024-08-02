package com.dobraccon.pain_market.product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    public Product create(Product product) {
        Product createdProduct = new Product(
                (long) Math.random(),
                product.getName(),
                product.getPrice(),
                product.getDiscount());
        return createdProduct;
    }

}
