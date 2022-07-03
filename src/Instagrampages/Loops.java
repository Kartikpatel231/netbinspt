/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;

import java.util.Scanner;

/**
 *
 * @author Kartik Patel
 */
public class Loops {
//sum of n numbers using for loop
    public static void main(String[] args){
        int sumEven=0;
        int sumOdd=0;
        Scanner obj=new Scanner(System.in);      
        System.out.println("Enter the number ");
        int n=obj.nextInt();
        for(int i=0;i<=n;i++){
            int x=obj.nextInt();                 
           if(x%2==0){
            sumEven=sumEven+x;
        }
           else{
               sumOdd=sumOdd + x;
                       }}
            System.out.println("Sum of all Evemnumber is"+sumEven);
            System.out.println("Sum of all Oddnumber is"+sumOdd);
        }
}
