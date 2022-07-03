/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;
import java.util.Scanner;
/**
 *
 * @author Kartik patel
 */
 class LucasTest{
//You can also make this program easier by using funtion
//here i am not using funtion I gave you hint here
     //lucas Series is 1,1,3,5,9......n terms

}
public class FactorialNumber {
    public static void  main(String[] args){
    int n,i,a=1,b=1,c=1,d;
    n=10;
    System.out.println(" "+a+" "+b+" "+c);
    for(i=1;i<(n-3);i++){
        d=a+b+c;
        System.out.println(" "+d);
        a=b;
        b=c;
        c=d;
    }

        /*   int i,n;   
     Scanner obj=new Scanner(System.in);
     System.out.println("enter value of n ");  
     n=obj.nextInt();
     int f=1;
     for(i=n;i>=1;i--){
         f=f*i;
     }
     System.out.println("\n The Factorial of"+n+" is="+f);
     
     /*/
     
     
     
     
     
     
     
     
        /* int n,i,a,b,c;
        a=0;
        b=1;
        c=0;

        System.out.print(" "+a+" "+b);
        for(i=1;i<=(n-2);i++){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }8*/
    }
}
