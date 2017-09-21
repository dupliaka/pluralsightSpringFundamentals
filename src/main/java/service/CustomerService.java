package service;

import model.Customer;

import java.util.List;

/**
 * Created by anna on 21.09.17.
 */
public interface CustomerService {
    List<Customer> findAll();
}
