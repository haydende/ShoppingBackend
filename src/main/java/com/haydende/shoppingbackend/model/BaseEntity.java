package com.haydende.shoppingbackend.model;

import lombok.Data;

@Data
public abstract class BaseEntity {

    private Long id;
    private String name;

    BaseEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
