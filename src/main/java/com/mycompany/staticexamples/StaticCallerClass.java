/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.staticexamples;

//using the static import allows the use of simple class names
import static java.lang.Math.random;  //allow call to be double d = random();
import static java.lang.Math.*;       //allos call to any class in Math with simple name (e.g. double d = random() or a = abs()).

/**
 *
 * @author Darren
 */
public class StaticCallerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d = Math.random();
        StaticUtilityClass.printMessage();
        StaticUtilityClass sm = new StaticUtilityClass();
        sm.printMessage();
        sameClassMethod();
        
        double p = Math.PI;
        
        new StaticCounterClass();
        new StaticCounterClass();
        System.out.println("count: " + StaticCounterClass.getCount());
        
    }
    
    public static void sameClassMethod(){
        System.out.println("running with StaticCaller");
    }
    
}
