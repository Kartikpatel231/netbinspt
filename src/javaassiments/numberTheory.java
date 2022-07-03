/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;
import java.util.Scanner;
/**
 *
 * @author abc
 */
public class numberTheory {
    public static int seiveMethod(int n){
        Boolean[] boolArray=new Boolean[n];
        boolean isPrime[]=new boolean[n+1];
        //boolean array[]= new Bool array[b];
        for(int i=0;i<n;i++){
            isPrime[i]=true;
        }
            isPrime[0]=false;
            isPrime[1]=false;
        for(int i=2;i*i<=n;i++){
         if(isPrime[i]==true){
             for(int j=i*i;j<=n;j+=i){
             isPrime[j]=false;
         }
         }   
        }
    
    int count=0;
    for(int i=0;i<=n;i++){
    if(isPrime[i]==true){
        count++;}
}
   return count;
    }


    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    numberTheory obj=new  numberTheory();
    int Prime=seiveMethod(n);
     System.out.println(Prime);
    
  System.out.println(obj.seiveMethod(n));
   
    }
}

