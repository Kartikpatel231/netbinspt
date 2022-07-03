/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
public class customeexception {
static void demoproc(){
    NullPointerException e=new NullPointerException("Top layer");
    //add a couse
    e.initCause(new ArithmeticException("Cause"));
    throw e;
}
public static void main(String[] args){
    try{
        demoproc();
    }
    catch(NullPointerException e)
    {
        //display top level exception
        System.out.println("Caught"+e);
        //display cause exception
        System.out.println("original cauuse"+e.getCause());
    }
}
}

