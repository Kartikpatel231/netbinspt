/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentcafe.inheritence;

/**
 *
 * @author abc
 */
class A3
        {
    int a,b;
    void get1(int x,int y)
    {
        a=x;
        b=y;
        System.out.println("sub add="+(a+b));
    }
}
class B3 extends A3
{
    int n,v;
    void get2(int t,int m,int l,int r)
    {
        super.get1(t,m);
        n=l;
        v=r;
        System.out.println("Sub Add="+(n+v));
    }
}
public class Inhe3 {
    public static void main(String []args){
    B3 ob=new B3();
    ob.get2(1,2,3,4);
}
}