package com.haydende.shoppingbackend.model;

public class Customer extends BaseEntity {

    private String email;
    private String password;
    private Order[] orders = new Order[]{};

    Customer(Long id, String name, String email, String password) {
        super(id, name);
        this.email = email;
        this.password = password;
    }
}
