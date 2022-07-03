/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
public class Throwsexception {
    static void throwOne() throws IllegalAccessException
    {
        System.out.println("Inside throw one");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args){
        try{
            throwOne();
        }
        catch(IllegalAccessException e){
            System.out.println("Caught"+e);
        }
    }
    
}
