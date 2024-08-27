package com.demo.main;

import com.demo.beans.Student;
import com.demo.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student=(Student) context.getBean("std");
        student.display();
    }

}
