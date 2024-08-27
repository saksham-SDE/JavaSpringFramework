package com.demo.resources;

import com.demo.beans.Address;
import com.demo.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Address add(){
        Address a=new Address();
        a.setHouseNo(5);
        a.setCityStreet("Piploda Road");
        a.setCity("Jaora");
        return a;
    }
    @Bean
    public Student std(){
        Student s=new Student();
        s.setName("Saksham");
        s.setRollNo(21);
        s.setEmail("21Saksham@gmail.com");
        s.setAddress(add());
        return s;
    }
}
