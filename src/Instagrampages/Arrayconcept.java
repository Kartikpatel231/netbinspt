/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;
import java.util.Scanner;
/**
 *concept of two dimenstional array with Transpose matrix; 
 * @author Kartik Patel
 */
public class Arrayconcept {
public static void main(String[] args){
  int i,j,temp;
  Scanner obj=new Scanner(System.in);
  System.out.print("enter size of array ");
  int n=obj.nextInt();
  int a[][]=new int[n][n];
  System.out.print("Enter the array elements");
  for(i=0;i<n;i++){
      for(j=0;j<n;j++){
          a[i][j]=obj.nextInt();
      }}
  for(i=0;i<n;i++){
      for(j=0;j<n;j++){
          if(i<=j){
              temp=a[i][j];
              a[i][j]=a[j][i];
              a[j][i]=temp;
          }}}
  System.out.println("Transpose matrix is");
  for(i=0;i<n;i++){
      for(j=0;j<n;j++){
          System.out.print(" "+a[i][j]);
      }
      System.out.println(" ");
      }}}

/* int i,j;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the size of 1st array");
    int n=obj.nextInt();
    int ar1[]=new int[n];
    System.out.println("enter the size of 2nd array");
    int n1=obj.nextInt();
    int ar2[]=new int[n1];
    System.out.print("enter the 1st array elements");
    for( i=0;i<n;i++)
        ar1[i]=obj.nextInt();
    System.out.print("enter the 1st array elements");
    for( j=0;j<n1;j++)
        ar2[j]=obj.nextInt();
    for(i=0;i<n;i++){
    System.out.println("1st array elements="+ar1[i]);
    }
    for(j=0;j<n1;j++){
    System.out.print("2nd array elements="+ar2[j]);
    }
    //now we make two dimenstiaonal array
    int k,l = 0;
    int ar3[][]=new int[n][n1];
    System.out.println("enter the value of two dimentional array");
    for( k=0;k<n;k++){
        for( l=0;l<n1;l++){
    ar3[k][l]=obj.nextInt();
    }    
    }
    for( k=0;k<ar3.length;k++){
    for( l=0;l<ar3.length;l++){
     System.out.print("two dimenstianal array is="+ar3[k][l]);
                }
                System.out.println();
    }
 */