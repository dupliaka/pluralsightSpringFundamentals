package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by anna on 21.09.17.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
