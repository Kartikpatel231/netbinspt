/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamental1.patterns;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class pattern {
       Scanner in=new Scanner(System.in);
    int n=in.nextInt();
  void get(){
   // Scanner in=new Scanner(System.in);
    //int n=in.nextInt();
    int nst=n;
    int row=1;
    for(; row<=n;row++){
     for(int col=1;col<=n;col++){
        System.out.print("*");
      }
     System.out.println();
    }
            System.out.println("diffrent pattern");

  }
    void get1(){
    //int row1=1;
    for(int row=1; row<=n;row++){
        for(int col=1;col<=row;col++){
            
        
        System.out.print("*");
    }
          System.out.println();
    }
            System.out.println("diffrent pattern");
  
  }
    void get2(){
        int nst=n;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=nst;col++){
                System.out.print("*");
            }
            
            System.out.println();
        nst--;
        }
        System.out.println("diffrent pattern");
    }
    void get3(){
        int nst=1;
        int nsp=n-1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=nsp;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=nst;col++){
        System.out.print("*");
            }
            System.out.println();
            nst=nst+1;
        nsp--;
    }
    }
    void get4(){
        int nst=n;
        int nsp=0;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=nsp;col++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=nst;col++)
            {
                System.out.print("*");
            }
            System.out.println();
            nst=nst-1;
            nsp=nsp+2;
        }
    }
    void get5(){
        int nst=1;
        int nsp=n-2;
   
        for(int row=1;row<=n;row++){
            if(nst==1 || nst==n){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            }
            if(row>1 && row<n){
           
           for(int col=1;col<=1;col++){
               System.out.print("*");
               
            }
            for(int col=1;col<=nsp;col++)
            {
                System.out.print(" ");
                
            }
            for(int col=1;col<=1;col++){
                System.out.print("*");
            
            }
            }
            
          System.out.println();
        nst++;
        //nsp++;
            
          //  
        }
          
    }
    void get6(){
        //int nst=n;
        //int nsp=n;
        
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row==col || row+col==(n-1)){
                System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();   
        }
     
    }
    void get7(){
        int nst=n;
        int nsp=
    }
 public static void main(String [] args){
     System.out.println("enter the value of n");
     pattern ob=new pattern();
     //ob.get();
   // ob.get1();
    // ob.get2();
    // ob.get3();
 //ob.get4();
 //ob.get5();
 //ob.get6();
 }
 }
