package com.haydende.shoppingbackend.service;

import com.haydende.shoppingbackend.model.Customer;

public interface CustomerService {

    Customer findById(Long id);

    Customer findByEmail(String email);

    void delete(Customer customer);

    void deleteById(Long id);
}
