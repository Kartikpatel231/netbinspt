/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arryconcept;
import java.util.*;
import java.util.Arrays;
/**
 *
 * @author abc
 */

public class BinarySearch {
  
static int binarySearch(int arg[],int n,int key)
{
   
    int s=0,e=n-1;
    while(s<=e){
        int mid=(s+e)/2;
        if(arg[mid]==key){
            return mid;
        }
        else if(arg[mid]>key){
        e=mid-1;
        }
        else{
    s=mid+1;
}
    }
return -1;
}
public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
        System.out.println("pls enter the number of  element");
        int n=in.nextInt();
        System.out.println("enter "+n+"integer");
        int arg[]=new int[n];
        for(int i=0;i<n;i++){
            arg[i]=in.nextInt();
    }
        Arrays.sort(arg);
        System.out.println("enter the key that you wanna to find");
        int key=in.nextInt();
         int pos=binarySearch(arg,n,key);
        if(pos==-1){
            
             
       System.out.println("key is not found");
        }
   else
   {
       System.out.println("key  is found at index"+pos);
   }
    
}
//BinarySearch inn=new BinarySearch();
 
 }
