/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abtraction.Exceptionhandling;
import java.util.Scanner;

/**
 *
 * @author abc
 */
public class exceotion {
    void p(){
        int a=40/0;
    }
    void q(){
                            System.out.println(" p funtion is called");

        p();
    
    }
    void r(){
                    System.out.println("r funtion is called");

        try{
            q();
        }
        catch(Exception e){
            System.out.println("Excetion handled here in q");
                    
        }
    }
    static void validate(int age){
            if(age<18){
                try{
                throw new ArithmeticException("not valid for vote");
         }
                catch(Exception e){
                          System.out.println("r funtion is called");

                }
            }
            else {
                System.out.println("valid for vote");
            }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();
     exceotion in=new exceotion();
     validate(age);
     in.r();           
        
    }
    
}
