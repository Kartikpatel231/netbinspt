/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;

/**
 * @author Kartik Patel
 */
public class SimpleProblem {
 public static void main(String[] args){
     int i=1;
     do
     {
         System.out.print(""+i);
         i++;
     }while(i<=10);

 }   
}













/* 
 *      int r,n,x,sum;
     n=153;
     x=n;
     sum=0;
     while(n!=0){
         r=n%10;
         sum=sum+(r*r*r);
         n=n/10;
     }
     if(sum==x)
             System.out.println("Number"+x+"is a Armstrong number");
     else
             System.out.println("Number"+x+"is not a  Armstrong number");
 int n,x,r,sum,f,i;
     n=145;                                //value
     x=n;                                  //x is equal to n 
     sum=0;                                //initialize sum variabel with 0;
     while(n!=0){                          //given condition so loop will work
         r=n%10;                           //using modules to get reminder 
         f=1;                             //initialize with 1 for multiplication
         for(i=1;i<=r;i++){               //use for loop 
             f=f*i;                       //it will multiplie until loop not over
         }
         sum=sum+f;                       //final sum
         n=n/10;                          //n divided by 10 until n not become 0
     }                                    //because while loop is still working
     if(sum==x)                            //compare your answer 
         System.out.println(x+" is a Strong Number");
     else
         System.out.println(x+" is not a strong number");
 */