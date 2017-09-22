package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
@Scope("singleton")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("we are using constructor injection  ");
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("we are using setter  injection  ");

    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
