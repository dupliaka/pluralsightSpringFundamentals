package com.pluralsight;

import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
    public static void main(String [] arg) {
        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName()  );


    }
}