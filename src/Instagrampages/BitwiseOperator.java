/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;

/**
 *
 * @author Kartik patel
 */
public class BitwiseOperator {
    public static void main(String args[] ){
        int a=3,b=6;
        boolean c=true,d= false;
        System.out.println("a="+a+"    b="+b);
        System.out.println("a&b="+(a&b));         //bitwise "and" operator
        System.out.println("a|b="+(a|b));         //bitwise "or" opertor
        System.out.println("a^b="+(a^b));         //bitwise "exclusive Or "
        System.out.println("~a="+~a);              //unary operotors(~)
        System.out.println("a<<3="+(a<<3));        //Shift operator <<,>>
        System.out.println("a&b="+(c&d)+"      a|b="+(c|d)+"      a^b="+(c^d));
    }
}
