/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abtraction;

/**
 *
 * @author abc
 */
abstract class Bank{
    abstract int getRateOfInterest();
    
}
class SBI extends Bank
{
    int getRateOfInterest()
    {
        return 7;
        
    }
    
}
class PNB extends SBI
{
    int getRateOfInterest()
    {
        return 9;
    }
}

public class Abstrat1bank {
public static void main(String args[])
{
    Bank b=new PNB();
    //int interest=b.getRateOfInterest();
    //System.out.println("Rate of interest is :"+interest+"%");
    
}
}
