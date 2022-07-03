/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 * Program to explain the following String Buffer function
 * StringBuffer()
 * @author Kartik
 */
public class funtions {
    public static void main(String[] args){
StringBuffer sb=new StringBuffer(40);
sb=sb.append('j');
System.out.println("String 1 ="+sb );
sb.append(new char[]{'a','v','a',' '});
System.out.println("String 2 ="+sb);
sb=sb.append(true);
System.out.println("String 3 ="+sb);
        
}}














/*
 * char ch[]={'j','a','v','a'};
String s1=String.valueOf(ch);
System.out.append("\n String s1="+s1);

String s2=String.valueOf(" Java program ");
System.out.append("\n String s2="+s2);

String s4=String.valueOf(true);
System.out.append("\n String s4="+s4);

String s5=String.copyValueOf(new char[] {'j','a','v','a'},2,2);
System.out.append("\n String s5="+s5);

String s6=String.valueOf(100);
System.out.append("\n String s6="+s6);

String s7=String.valueOf(55.55d);
System.out.append("\n String s7="+s7);

String s8=String.valueOf(1001);
System.out.append("\n String s8="+s8);

String s9=String.valueOf(Math.PI);
System.out.append("\n String s9="+s9);
 * Scanner obj=new Scanner(System.in);
String s3,s4;
System.out.println("intput String s1 ");
String s1=obj.nextLine();
System.out.println("intput String s1 ");
String s2=obj.nextLine();
 s3=s1.toLowerCase();
 s4=s2.toUpperCase();
 System.out.println("It is in Lower case = "+s3);
 System.out.println("It is in Upper case = "+s4);
 * System.out.println("enter the input to split it");
String s1=obj.nextLine();
String s2[]=s1.split(" ");
System.out.println("String="+s2[0]);
System.out.println("String="+s2[1]);
System.out.println("String="+s2[2]);
 * boolean b,b1;
System.out.println("pls input string s1");
String s1=obj.nextLine();
System.out.println("pls input string s2");
String s2=obj.nextLine();
b=s1.regionMatches(5, s2, 0, 8);
//for ignore case
b1=s1.regionMatches(true, 5, s2, 0,8);
System.out.println("Result of Region Match"+b);
System.out.println("Result of Region Match for ignore case:"+b1);
 * 
 * char ch[]=new char[4];
String s="Java Programming String Funtions";
s.getChars(0, 4, ch,0 );
String s1=new String(ch);
System.out.println("Source:"+s);
System.out.println("Target: ");
System.out.println(ch);
System.out.println("Source"+s);
System.out.println("Target  "+s1);

 * String s1="Java";
String s2="Java";
String s3="Svvv";
//compareTo give answer in binary form if it is true then 0 wil occure
//if it is false it will display any random number as you see in output
System.out.println(s1+"  compare to "+s2+"="+s1.compareTo(s2));
System.out.println(s1+" compare to "+s3+"="+s1.compareTo(s3));
 * char ch[]={'j','a','v','a'};
String s1=new String(ch);
System.out.println("String="+s1);
System.out.println("String="+s1.length());
System.out.println("String="+"Java_core_tricks page"+s1);
 * String s1="Java_core_tricks";
ch=s1.charAt(0);
System.out.println("Charcter at 0"+ch);
ch=s1.charAt(3);
System.out.println("Charcter at 3"+ch);
}
 * char ch[]={'j','a','v','a'};
String s1=new String(ch);
byte b[]={ 97,98,99,100,101,102};
String s2=new String(b);
System.out.println("String="+s1);
System.out.println("String="+s2);
  
 * char ch[]={'k','a','r','t','i','k','p'};
   String s=new String(ch);
   System.out.println("String="+s);
   //string s1=2022;
   String s1=" "+2022;
   System.out.println("String="+s1);
 */