package com.k4j4n.repository;

import com.k4j4n.model.Customer;

import java.util.List;

/**
 * Created by K4J4N on 8/6/2017.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
