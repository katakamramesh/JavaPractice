package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name , int age,  Address address){};
record Address(String city, String country){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "bean";
    }

    @Bean
    public int age(){
        return 10;
    }

    @Bean
    public Person person(){
        var p = new Person("mani",30, new Address("dubai", "uae"));
        return p;
    }

    @Bean(name = "address")
    public Address address(){
        return new Address("london","UK");
    }

    @Bean(name = "customeraddress")
    @Primary
    public Address customerAddress(){
        return new Address("leeds","UK");
    }

    @Bean
    @Qualifier("addressQualifier")
    public Address customerQualifierAddress(){
        return new Address("scotland","UK");
    }

    @Bean
    public Person personMethodQualifier(String name, int age, @Qualifier("addressQualifier")Address add){
        return new Person("mani",30, add);
    }

    @Bean
    public Person personMethodCall(){
        return new Person(name(),age(), address());
    }

    @Bean
    public Person personMethodParameter(String name, int age, Address address){
        return new Person(name,age, address);
    }
}

