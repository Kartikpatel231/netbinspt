/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
public class exceptionhandling {
      int num1, num2;

    void exceptionhandlin(){
        num1 = 0;
         num2 = 62 / num1;
         System.out.println(num2);
         System.out.println("Hey I'm at the end of try block");
    }
     void set(){
     
      String[] name={"Kartik","Kuldeep","Deepak","Pradeep"};
      name[4]="Pradeep";
      System.out.println("name"+name[5]);
      }
    public static void main(String args[]) {
        exceptionhandling obj=new exceptionhandling();
      try {
         obj.exceptionhandlin();
       
           }      
      
       catch (ArithmeticException e) { 
        
         System.out.println("You should not divide a number by zero");
      }
      try{
       obj.set();
      }
     catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Array not founding the value");
      }
      catch (Exception e) {
         
         System.out.println("Exception occurred");
      }
      System.out.println("I'm out of try-catch block in Java.");
}
}
