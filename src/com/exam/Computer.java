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
public class Computer {
    String circuitboard="Intel";
    String processor;;

    public Computer() {
        System.out.println("b is created");
    }

    public String getCircuitboard() {
        return circuitboard;
    }

    public void setCircuitboard(String circuitboard) {
        this.circuitboard = circuitboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
}
