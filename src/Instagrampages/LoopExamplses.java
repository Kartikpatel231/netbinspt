/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;
import java.util.Scanner;
/**
 *
 * @author kartik
 */
//for each examples
public class LoopExamplses {
public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter no.");
    int n=obj.nextInt();
    for(int i=0;i<n;i++){
        System.out.print(i+" ");
        i=i*10;
            System.out.println(i);

    }
    

    }}
/*  
 * for(int val: arrayname){
    System.out.print(val);
}
System.out.println();
for(float val:arrayname){
    System.out.print(val);
}
System.out.println();
for(double val:arrayname){
    System.out.print(val);
}
 * String s1="I love India";
char s2[]=new char[s1.length()];
for(int i=0;i<s1.length();i++)
{
    s2[i]=s1.charAt(i);
}
for(char e: s2){
    System.out.println(e);
}int t;
    int hcf=0;
 int lcm=0;
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter first number n1");
  int n1=obj.nextInt();
  System.out.println("Enter second number n2");
  int n2=obj.nextInt();
if(n1<n2)
    t=n1;
  else
    t=n2;
for(int i=1;i<=t;i++){
    if(n1%i==0 && n2%i==0){
        hcf=i;
    }
}
   System.out.println("Hcf:"+hcf);
   lcm=(n1*n2)/hcf;
   System.out.println("LCM"+lcm);  
 * boolean flag=true;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=obj.nextInt();
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            flag = false;
            break;
        }
    }
    if(flag==true)
        System.out.println("\n Number "+n+"is a Prime number");
    else
        System.out.println("\n Number "+n+"is a not Prime number");
    
 * int sum=0;
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the number");
    int n=obj.nextInt();
    for(int i=1;i<=n/2;i++){
        if(n%i==0){
            sum=sum+i;
        }
    }
    if(n==sum)
        System.out.println("\n The number is "+n+"is a perfect Number");
     else
     System.out.println("\n The number is not"+n+"is a perfect Number");*/