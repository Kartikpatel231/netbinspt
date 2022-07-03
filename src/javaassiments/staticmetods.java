/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
public class staticmetods {
    static void get(){
        System.out.println("This is static get method");
    }
    void gets(){
        System.out.print("This is normal gets methods");
    }
    public static void main(String args[]){
        staticmetods obj=new staticmetods();
        obj.get();
        obj.gets();
    }
}
