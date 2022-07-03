/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author abc
 */
class fist{
    int i;
    int pt[]=new int[20];
    int at[]=new int[20];
    int bt[]=new int[20];
    //intiallizing 
    int tt[]=new int[20];
    int wt[]=new int[20];
    int avt=0,att=0;
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
    fist(){
     System.out.println("enter the no.of process that you want");
    
     System.out.println("Enter the process");
    for(i=0;i<n;i++){
         pt[i]=obj.nextInt();
         if(i<n){
             System.out.println("Enter the bust time");
             bt[i]=obj.nextInt();
            
         }
         if (i<n){
             System.out.println("Enter arrival time for"+i);
             at[i]=obj.nextInt();
    }
   
         }
}
    void calculation(){
       wt[0]=0;
       for(i=1;i<n;i++){
           wt[i]=bt[i-1]+wt[i-1];
           avt+=wt[i];
       }
       for(i=0;i<n;i++){
           tt[i]=bt[i]+wt[i];
           att+=tt[i];
       }
       
    }
    void result(){
        for(i=0;i<n;i++){
            System.out.println("Total wating time"+wt[i]);
            System.out.println("Total turnaronud time"+tt[i]);
        }
        float s=(float)avt/(float)n;
        int c=att/n;
        System.out.println("average wating time"+s);
        System.out.println("average turnaround time"+c);
    }
}

        public class fcfs {
    public static void main(String[] args){
     fist obj=new fist();
     obj.calculation();
     obj.result();
     System.out.println("finish");
     
    }
    
}
