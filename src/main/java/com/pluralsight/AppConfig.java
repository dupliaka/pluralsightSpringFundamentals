package com.pluralsight;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
//        //CustomerService customerService = new CustomerServiceImpl(getCistomerRepository());
//        CustomerService customerService = new CustomerServiceImpl();
//        //  customerService.setCustomerRepository(getCistomerRepository());
//        return customerService;
//    }

//    @Bean(name = "customerRepository")
    //  public CustomerRepository getCistomerRepository() {
    //    return new HybernateCustomerRepositoryImpl();
    //}
}
