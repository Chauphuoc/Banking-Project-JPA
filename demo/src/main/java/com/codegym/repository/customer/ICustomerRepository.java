package com.codegym.repository.customer;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAllCustomers();

    Customer findCustomerByID(Long id);

    void save(Customer customer);

    void remove(Long id);
}