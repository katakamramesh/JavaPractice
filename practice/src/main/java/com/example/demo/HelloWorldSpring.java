package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
    public static void main(String s[]){
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("personMethodCall"));
        System.out.println(context.getBean("personMethodParameter"));
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
        System.out.println(context.getBean("personMethodQualifier"));
        //System.out.println(context.getBean(Person.class));


    }

}
