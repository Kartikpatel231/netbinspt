/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *Simple Overriding program in java
 * @author Kartik
 */
class additon{
    int a,b,c=0;
    additon(int c,int d){
        a=c;
        b=d;
    }
    void Sum(){
        c=a+b;
    System.out.println("addition of two number is ="+c);
}
}
class  subtration extends additon{
    int k;
     subtration(int c,int d,int l){
    super(c,d);
    k=l;
    k=0;
     }
    void Sum(){
        super.Sum();  //use super key word to call addtion method
        k=a-b;
      System.out.println("Subtraction value ="+k);
     }
     }

public class overloding {
public static void main(String args[]){
   Scanner obj=new Scanner(System.in);
   System.out.println("pass parameter by user input a,b,c");
           int c=obj.nextInt();
           int d=obj.nextInt();
           int l=obj.nextInt();

           subtration obj1=new subtration(c , d ,l);
           obj1.Sum();
    }    
}
