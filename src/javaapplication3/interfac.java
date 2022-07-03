/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *Polymorphism with interface in java
 * @author Kartik patel
 */
interface Color{
    void get();
}
 class Rectangle implements Color{
    public void get(){
        System.out.println("Rectangle has red color");
    }
}
   class Triangle implements Color{
      
   public void get(){
        System.out.println("Triangle has green color");
    }
   }
public class interfac {
    public static void main(String[] args){
    Color C;          
    Rectangle R=new Rectangle();
    C=R;
    C.get();
    
    Triangle T=new Triangle();
    C=T;
    C.get();
    }    
    }

