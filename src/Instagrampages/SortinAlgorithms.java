/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;

import java.util.Scanner;

/**
 *  Selection Sort using scanner class;
 * @author Kartik Patel
 */
public class SortinAlgorithms {
public static void main (String[] args){
  int i,j;
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the size of array:");
  int n=obj.nextInt();
  int a[]=new int[n];
  System.out.println("Enter array elements");
  for(i=0;i<n;i++){
      a[i]=obj.nextInt();
  }
  int small,pos,tmp;
  for(i=0;i<n;i++){
      small=a[i];
      pos=i;
      for(j=i+1;j<n;j++){
          if(a[j]<small){
              small=a[j];
              pos=j;
          }
      }
      tmp=a[i];
      a[i]=a[pos];
      a[pos]=tmp;
  }
  System.out.print("\n Sorted Number are=");
  for(i=0;i<n;i++)
      System.out.print(a[i]+" ");
   }  }
/* int i;
    Scanner obj=new Scanner(System.in);
  System.out.println("Enter the size of Array");
  int n=obj.nextInt();
  int a[]=new int[n];
  System.out.print("Enter tej arrau elements");
  for( i=1;i<n;i++){
      a[i]=obj.nextInt();
      }
  int temp,j;
  a[0]=-2147483648;
  for( i=1; i<n;i++){
    temp=a[i];
for(j=i-1;temp<a[j];j--){
    a[j+1]=a[j];
    }
    a[j+1]=temp;}
  System.out.println("\n The Sorted Array is");
  for( i=1;i<n;i++)
      System.out.print(a[i]+" ");
 * Scanner obj=new Scanner(System.in);
    System.out.println("Enter size of array");
    int n=obj.nextInt();
    int a[]=new int[n];
    a[0]=0;
    a[1]=1;
    for(int i=2;i<n;i++)
    {
        a[i]=a[i-1]+a[i-2];
    }
    for(int i=0;i<n;i++)
        System.out.print(" "+a[i]);
  Scanner obj=new Scanner(System.in);
   int i,j,t;
   System.out.println("Enter the array size");
   int n=obj.nextInt();
   int a[]=new int[n];
   System.out.print("Enter array elements");
   for( i=0;i<n;i++){
       a[i]=obj.nextInt();
   }
      System.out.print("After  sorting array elements is=");
   for(i=0;i<n-1;i++){
       for(j=0;j<(n-1-i);j++)
       {
           if(a[j]>a[j+1])
           {
               t=a[j];
               a[j]=a[j+1];
               a[j+1]=t;
           }
       }
   }
   for(i=0;i<n;i++)
System.out.println(a[i]+" ");
 */