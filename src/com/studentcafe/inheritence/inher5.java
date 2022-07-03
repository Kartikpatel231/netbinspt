/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentcafe.inheritence;

/**
 *
 * @author abc
 */
class A6{
    int a;
    int b;
            void get9(int k,int p)
    {
        a=k;
        b=p;
        System.out.println("this is fistt subtration page"+(a-b));
    
        System.out.println("this is the additional"+a+b);
    } 
    }
    class B6 extends A6
    {
        int c;
        int d;
        void B6(int k,int p,int t, int r)
        {
            super.get9(k,p);
            c=t;
            d=r;
            System.out.println("this is first multiplication "+(c*d));
            System.out.println("this is first division "+(c/d));
        }
            
    }
            
    
public class inher5 {
    public static void main(String []ar)
    {
       B6 ob=new B6();
    ob.B6(1,2,3,4);
    }
    
}
