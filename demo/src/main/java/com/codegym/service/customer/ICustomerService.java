package com.codegym.service.customer;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAllCustomers();

    Customer findCustomerByID(Long id);

    void save(Customer customer);

    void remove(Long id);
}