package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

import java.util.List;

/**
 * Created by anna on 21.09.17.
 */
public interface CustomerService {
    List<Customer> findAll();

    void setCustomerRepository(CustomerRepository customerRepository) ;

}
