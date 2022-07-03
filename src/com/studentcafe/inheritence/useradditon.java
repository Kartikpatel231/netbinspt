/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentcafe.inheritence;

/**
 *
 * @author abc
 */

 // import java.io.*;
 import java.util.*;
public class useradditon {
	public static void main(String[]args){
		Scanner sc1=new Scanner(System.in);
		int a[]=new int[4];
		int b[]=new int[4];
		int c[]=new int[4];
		int i,j,l;
		//DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the array of first element\n");
		for(i=0;i<=3;i++)
		{
			a[i]=sc1.nextInt();

		}
		//DataInputStream dis=new DataInputStream(System.in);
		System.out.println("enter The array of second element \n");
		for(j=0;j<=3;j++)
		{
			b[j]=sc1.nextInt();
		}
		//DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Addition of two array\n");
		for(l=0;l<=3;l++)
		{
		c[l]=a[l]+b[l];
	    }
	    for(i=0;i<=3;i++)
	  
{
	    System.out.println(c[i]);
		//System.out.println(" addition of two array\n");
}		
		
		
	}
} 

