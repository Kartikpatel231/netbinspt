/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
 class Throwableexception {
static void throwOne() 
{
    try{
        throw new NullPointerException("demo");
    }
    catch(NullPointerException e)
    {
        System.out.println("Caught inside demoproc.");
        throw e;
    }
}
public static void main(String[] args){
    try{
        throwOne();
    }
    catch(NullPointerException e)
    {
        System.out.println("Recought"+e);
    }
}
}
