package com.k4j4n.repository;

import com.k4j4n.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by K4J4N on 8/6/2017.
 */

@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFistName("Kajan");
        customer.setLastName("Sivam");

        customers.add(customer);

        return customers;
    }
}
