package com.k4j4n.service;

import com.k4j4n.model.Customer;
import com.k4j4n.repository.CustomerRepository;
import com.k4j4n.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by K4J4N on 8/6/2017.
 */

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
        System.out.println("we are using constructor injection");
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
