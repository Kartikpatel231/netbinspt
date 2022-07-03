/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
/**
 * 
 * Array of String Examples
 * @author abc
 */
public class stringfuntions {
    public static void main(String[] arg){
       final int days=7;
       String str[]={ "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
       for(int i=0;i<days;i++){
           System.out.println(" "+str[i]);
       }
    }
}







/*
 *  StringBuffer sb=new StringBuffer("Java Programming Language");
        System.out.println("String="+sb);
        sb=sb.reverse();
        System.out.println("String="+sb);
    
 * StringBuffer sb=new StringBuffer(40);
     sb=sb.insert(0, 'I');
     System.out.println("String 1:"+sb);
     sb.insert(0,"NDIA");
     System.out.println("String 2:"+sb);
     sb.insert(5, new char[]{' ','i','s',' ','b','e','a','u','t','i','f','u','l'});
      System.out.println("String 3:"+sb);
      sb.insert(18,true);
      System.out.println("String 4:"+sb);
 *  String s=new String("Java");
      sb=sb.insert(0, s);
     System.out.println("String="+sb);
      sb.insert(25," Make by Kartik Patel");
     System.out.println("String="+sb);
 *   StringBuffer sb1=new StringBuffer("Java Programming Examples");
        System.out.println("String="+sb1);
        String s1=sb1.substring(5);
        System.out.println("String="+s1);
        String s2=sb1.substring(5,14);
        System.out.println("String="+s2);

 * StringBuffer sb1=new StringBuffer ("Java rogramming Examples.");
sb1.setCharAt(5,'p');
System.out.println("when p will insert in rogramming="+sb1);*/