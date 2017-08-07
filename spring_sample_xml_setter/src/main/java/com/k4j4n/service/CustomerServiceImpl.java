package com.k4j4n.service;

import com.k4j4n.model.Customer;
import com.k4j4n.repository.CustomerRepository;

import java.util.List;

/**
 * Created by K4J4N on 8/6/2017.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


}
