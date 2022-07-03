/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentcafe.inheritence;
class A
        {
    A()
    {
        System.out.println("A constructor called");
        System.out.println("ask");
    }
}
class B extends A
        {
B()
{
    System.out.println("B constructor in called");
}
}
 class Inhe1 {
     public static void main(String []ar)
     {
         B b=new B();
     }
    
}
