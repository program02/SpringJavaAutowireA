/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author shahidur
 */
public class MyApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/exam/beans.xml");
        Student st = (Student)ctx.getBean("st");
        System.out.println(st.name);
        System.out.println(st.getComputer().circuitboard);
    }
}
