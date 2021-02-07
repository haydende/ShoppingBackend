package com.haydende.shoppingbackend.service;

import com.haydende.shoppingbackend.model.Product;

public interface ProductService {

    Product findById(Long id);

    Product findByName(String name);

    void delete(Product product);

    void deleteById(Long id);

}
