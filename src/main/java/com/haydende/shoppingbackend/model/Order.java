package com.haydende.shoppingbackend.model;

import lombok.Data;

@Data
public class Order {

    private Long id;
    private Long customerId;
    private Product[] products = new Product[]{};

    Order(Long id, Long customerId) {
        this.id = id;
        this.customerId = customerId;
    }

    Order(Long id, Long customerId, Product[] products) {
        this(id, customerId);
        this.products = products;
    }

}
