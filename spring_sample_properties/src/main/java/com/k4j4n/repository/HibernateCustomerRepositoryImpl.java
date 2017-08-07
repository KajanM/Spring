package com.k4j4n.repository;

import com.k4j4n.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by K4J4N on 8/6/2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    private String dbUsername;

    @Override
    public List<Customer> findAll() {

        System.out.println("userName : " + dbUsername);
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFistName("Kajan");
        customer.setLastName("Sivam");

        customers.add(customer);

        return customers;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }
}
