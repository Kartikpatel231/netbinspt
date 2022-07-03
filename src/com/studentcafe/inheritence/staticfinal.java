/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentcafe.inheritence;

/**
 *
 * @author abc
 */
public class staticfinal {
    int roll;
     String name;
    static String sec;
     staticfinal(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
        System.out.println("your roll="+roll+"you name="+name);
       }
     
     staticfinal(String n)
    {
        sec=n;
        System.out.print("your section="+sec);
    }
    public static void main(String[] ar)
    {
        staticfinal p1=new staticfinal(2,"kartik");
        staticfinal p2=new staticfinal("B");
        staticfinal.sec=sec;
                
    }
}


