/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stringee;

/**
 *
 * @author abc
 */
public class stringbuffer {
    public static void main(String ars[]){
        StringBuffer sb=new StringBuffer("This is a test of String buffer");
        StringBuffer sb1=new StringBuffer("I java!");
        sb1.insert(2,"like");
        System.out.println(sb1);
        sb.delete(4,7);
        System.out.println("Afeter delete:"+sb);
        sb.deleteCharAt(3);
        System.out.println("After deletCharAt"+sb);
    }
}
