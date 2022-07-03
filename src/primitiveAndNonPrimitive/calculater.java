/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveAndNonPrimitive;
//import java.io.*;
import java.util.Scanner;
/**
 *
 * @author abc
 */
public class calculater {
   public static void main(String[] ar){
       System.out.print("wellcom to studentCafeCaluculater");
       System.out.println(" entering number and number ");
       Scanner in=new Scanner(System.in);
       
         System.out.println("enter first number 1.");
               int n1=in.nextInt();
               System.out.println("enter first number 2.");
               int n2=in.nextInt();
               System.out.println("1).Addition \n 2).Subtration \n 3).Division \n 4).Multiplication");System.out.println("enter your operater");
             int choise=in.nextInt();
            switch(choise){
           case 1:
            
               System.out.println("result"+(n1+n2));
               break;
           case 2:
               System.out.println("result"+(n1-n2));
           break;
           case 3:
               if(n2==0){
                   System.out.println("cannot divide by zero");
               }
               System.out.println("result"+(n1/n2));
               break;
           case 4:
               System.out.println("result"+(n1*n2));
               break;
           default:
               System.out.println("invalid no");
   }
   }
}
