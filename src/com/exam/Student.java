/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

/**
 *
 * @author shahidur
 */
public class Student {
    String name;
    Computer computer;

    public Student() {
        System.out.println("a is created");
    }

//    public Student(String name) {
//        this.name = name;
//    }

    public Student(Computer computer) {
        this.computer = computer;
    }

    public Student(String name, Computer computer) {
        this.name = name;
        this.computer = computer;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    
}
