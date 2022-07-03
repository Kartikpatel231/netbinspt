/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;
import java.util.Scanner;
/**
 *
 * @author Kartik
 */
public class java_core_Switchcase {
public static void main(String[] args){
  int a;
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter Day Number input between 1 to 4");
  a=obj.nextInt();
  switch( a ){
      case 1 :
          System.out.println("1)Simple java_Core_Program");
     break;
      case 2:    
          System.out.println("2)java__Advance");
      break;
      case 3:    
          System.out.println("3)Java_Awt");
      break;
      case 4:    
          System.out.println("4) java_Algorithm");
      break;
      default:
          System.out.println("Invalid input");
          }}
  }

