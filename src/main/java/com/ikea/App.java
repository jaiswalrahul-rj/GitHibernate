package com.ikea;

import com.ikea.entites.BdT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Service service = (Service) ac.getBean("Service");
        BdT bd=service.getBd(new BigDecimal(81846042));
        System.out.println(bd.getBdLineTs().size());
    }
}
