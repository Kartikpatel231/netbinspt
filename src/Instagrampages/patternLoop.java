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
public class patternLoop {
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in); //scanner will be used inside the main 
    System.out.println("Enter no.");    ////main funtion for local variabel initialization   
    int n=obj.nextInt();                         
      
        
         for(int i=1;i<=n;i++){
              for(int j=1;j<=n;j++){
                  if(i==1 || i==n || j==1 || j==n){
                      System.out.print("*");
                  }
                  else{
              System.out.print(" ");
        }
              
              if(j==n){
        System.out.println();
    }
}    
}
}
}