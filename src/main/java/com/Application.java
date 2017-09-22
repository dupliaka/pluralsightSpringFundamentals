package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pluralsight.service.CustomerService;

/**
 * Created by anna on 21.09.17.
 */
public class Application {
    public static void main(String [] arg) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(service);
        CustomerService service1 = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(service1);
        System.out.println(service.findAll().get(0).getFirstName());

    }
}
