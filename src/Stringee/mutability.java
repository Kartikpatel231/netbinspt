/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stringee;

/**
 *
 * @author abc
 */
public class mutability {
    public static void main(String[] ar){
        String s1="geeks";
        String s2=s1;
        s1=s1+"forgeeks";
        if(s1.equals(s2) )
            System.out.println("same");
        else
            System.out.println("not same");
        StringBuilder s3=new StringBuilder("geeks");
        StringBuilder s4=s3;
        s3=s3.append("forgeeks");
        if(s3 == s4)
            System.out.println("same");
        else
            System.out.println("not same");
    }
}
