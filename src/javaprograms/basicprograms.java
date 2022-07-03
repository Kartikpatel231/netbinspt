/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author abc
 */
public class basicprograms {
    /*public double areaOfCircle(){
        double rad;
        rad=10.0;
        final double PI =3.14159;
        double areaOfCircle=PI*rad*rad;
    return areaOfCircle;   
    }
    public double areaOfTrinagle(){
        double area,a,b,c,result;
        a=3;
        b=4;
        c=5;
        result=(a+b+c)/2;
        area=Math.sqrt(result*(result-a)*(result-b)*(result-c));
        return area;
    }
    public void simpleConversion(){
        double n=56.50;
        int a=(int)n;
        double p=(n-a)*100;
        System.out.println("rs:"+a);
        System.out.println("rs:"+(int)p);
        }
    public static void simpleInterest(){
        Scanner obj=new Scanner(System.in);
        double a,p,r,n,ci;
        p=1000;
        r=10;
        n=obj.nextDouble();
        a=p*Math.pow((1+(r/100.0)), n);
        ci=a-p;
        System.out.println("Amount="+a);
        System.out.println("Compund interest="+ci);
        
    }
    public void charDemo(){
        char a=88;
        char b='y';
        System.out.print("a and b"+a+" "+b);
        a++;
        System.out.println("a="+a);
    }
    public boolean Booltest(){
        boolean b=false;
        b=true;
        if(b)
            System.out.println("This is executeable code");
        return b;
         }
    public static void dynamic(){
        double a=3.0,b=4.0;
        double c=Math.sqrt(a*a+b*b);
        System.out.println("Hypotenuse is"+c);
    }
    public void constant(){

         final  int numberofMonths=12;
         final  double PI=(double)22/7;
        System.out.println("number of months="+numberofMonths+"value of pi"+PI);
    }
    public static int swapping(){
        int a,b,t;
        a=2;
        b=3;
        System.out.println("value of a"+a+"value of b"+b);
        t=a;
        a=b;
        b=t;
        System.out.println("value of a"+a+"value of b"+b);
    a=2;
    b=3;
    System.out.println("value of a"+a+"value of b"+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("value of a"+a+"value of b"+b);
        return t;
    }
    public static void calculatedays(){
        int Days,Weeks,Months,Year;
        Scanner obj=new Scanner(System.in);
        Days=obj.nextInt();
        Year=Days/365;
        Days=Days%365;
        Months=Days/30;
        Days=Days%30;
        Weeks=Days/7;
        Days=Days%7;
        System.out.print(Year+" "+Months+" "+Weeks+" "+Days);
        
    }
    public void input(){
        try{
        Console obj=System.console();
        
        int a=Integer.parseInt(obj.readLine());
         System.out.println(a);
        }
        catch(Exception e){
        System.out.println("this is java");
        }
       
    }*/
public static void main(String args[]){
    //Scanner obj=new Scanner(System.in);
    //String name=obj.nextLine();
    //System.out.print(name);
    basicprograms obj=new basicprograms();
    //System.out.println(obj.areaOfCircle());
    //double areaOfTrinagle=obj.areaOfTrinagle();
    //System.out.println(areaOfTrinagle);
    //obj.simpleConversion();
    //obj.simpleInterest();
   // obj.charDemo();
    //System.out.println(obj.Booltest());
    //obj.dynamic();
    //obj.constant();
    //obj.swapping();
    //obj.calculatedays();
//obj.input();
//int num,num1,sum;
//num=Integer.parseInt(args[0]);
//num1=Integer.parseInt(args[1]);
//sum=num+num1;
//System.out.println(sum);
int a=10;
System.out.println("before return");
if(a==10){
    System.exit(0);
   System.out.println("After return");
}
}
}    
}
