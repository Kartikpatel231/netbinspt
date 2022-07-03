/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentcafe.inheritence;

/**
 *
 * @author abc
 */
class A1
        {
    void get()
    {
        System.out.println("this is vooid method");
    }
}
class B2 extends A1
{
    void get1()
    {
        get();
        System.out.println("this is 2 void method");
    }
}
public class Inhe2 {
    public static void main(String [] ar){
        B2 s1=new B2();
        s1.get1();
        
    }
        
    
            
}
