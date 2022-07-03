/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentcafe.inheritence;
import java.util.Scanner;
/**
 *
 * @author abc
 */
public class fabinco {
    int set(int n){
        if(n==0){
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
          
       int smallout1=set(n-1);
     int smallout2=set(n-2);
        int sum=smallout1+smallout2;
     return sum;
   }
   void display(){
         System.out.println("this is the solution");
   
   }  
   
    public static void main(String[] ar){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("enter the value of n");
        
        System.out.println();
     
     fabinco ob=new fabinco();
    // int re=ob.display();
     // ob.display();
    int ram= ob.set(n);
      
    System.out.println(ram); 
                }
    
}
