/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arryconcept;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class binary {
    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);
        System.out.println("enter size of array:");
        
        int n=in.nextInt();
        //int ar[]={ 20,12,12,12,12,12};
        int am[]=new int[n];
        int arrg=0;
        try{
        for(int i=1;i<am.length;i++){
             am[i]=in.nextInt();
             
                 if(am[i]>am[arrg]){
                     arrg=i;
                 
                 }
                 
             }
                             System.out.print(arrg);

        
        }
       
        
        catch(Exception e){
            System.out.println("array index out of bound:");
        }
    }
       // System.out.println("select item ");
     //   int item=in.nextInt();
   //     System.out.println(binarye(am,item));
    
    }
    /*public static int binarye(int[] am,int item){
    int low=0;
    int high=am.length-1;
    while(low<=high){
        int mid=(low+high)/2;
    if(am[mid]<item){
        low=mid+1;
    }
    else if(am[mid]>item){
        high=mid-1;
        
    }
    else{
        return mid;
    }
    }
    return -1;*/
    
   
