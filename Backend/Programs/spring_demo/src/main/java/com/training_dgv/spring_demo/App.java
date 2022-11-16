package com.training_dgv.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Staff staff = (Staff)applicationContext.getBean("peon");
//        staff.print();
        Help help = (Help)applicationContext.getBean("help");
        help.print();
    }
}
