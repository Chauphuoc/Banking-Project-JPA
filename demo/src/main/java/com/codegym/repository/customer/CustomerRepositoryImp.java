package com.codegym.repository.customer;

import com.codegym.model.Customer;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Transactional
public class CustomerRepositoryImp implements ICustomerRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Customer> findAllCustomers() {
        TypedQuery query = entityManager.createQuery("SELECT c FROM Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findCustomerByID(Long id) {
        TypedQuery<Customer> query = entityManager.createQuery("SELECT c FROM Customer c WHERE c.id=:id",Customer.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void save(Customer customer) {
        if (customer.getId() != null) {
            entityManager.merge(customer);
        }
        else entityManager.persist(customer);
    }

    @Override
    public void remove(Long id) {
        Customer customer = findCustomerByID(id);
        if (customer != null) {
            entityManager.remove(customer);
        }
    }
}