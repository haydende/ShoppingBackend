package com.haydende.shoppingbackend.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product extends BaseEntity {

    private double price;

    Product(Long id, String name, double price) {
        super(id, name);
        this.price = price;
    }

}
