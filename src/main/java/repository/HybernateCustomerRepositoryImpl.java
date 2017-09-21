package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anna on 21.09.17.
 */
public class HybernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Anna");
        customer.setLastName("Dupliak");
        customers.add(customer);
        return customers;
    }
}
