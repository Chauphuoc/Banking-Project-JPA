package com.codegym.service.customer;

import com.codegym.model.Customer;
import com.codegym.repository.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAllCustomers();
    }

    @Override
    public Customer findCustomerByID(Long id) {
        return customerRepository.findCustomerByID(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}