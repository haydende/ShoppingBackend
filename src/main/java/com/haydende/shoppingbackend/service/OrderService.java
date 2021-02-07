package com.haydende.shoppingbackend.service;

import com.haydende.shoppingbackend.model.Order;

public interface OrderService {

    Order findById(Long id);

    Order[] findAllByCustomerId(Long customerId);

    void delete(Order order);

    void deleteById(Long id);
}
