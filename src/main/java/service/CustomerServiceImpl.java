package service;

import model.Customer;
import repository.CustomerRepository;
import repository.HybernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by anna on 21.09.17.
 */
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HybernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
