/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.staticexamples;

/**
 *
 * @author Darren
 */
public class StaticCounterClass {
    private static int counter = 0;
    {
        System.out.println("Building");
    }
    
    public StaticCounterClass(){
        counter++;
        }
    public static int getCount(){
        return counter;
    }
}
