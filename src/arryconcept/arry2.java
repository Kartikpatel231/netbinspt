/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arryconcept;
import java.util.*;
/**
 *
 * @author abc
 */
public class arry2 {
    public static void main(String []arg)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("how many number do you need to draw");
        int k=in.nextInt();
        System.out.print("What is the highest number you can draw");
        int n=in.nextInt();
        //fill an array with number 1 to n
        int a[]= new int[n];
        for(int i=0;i<n;i++)
            a[i]=i+1;
        //draw k number and put them into a second array
        int b[]=new int[k];
        for(int i=0;i<k;i++)
        {
            //make random index between 0 and n-1
            int r=(int) (Math.random()*n);
            //pick the element at the random location 
            b[i]=a[r];
            //move the last element into the random location 
            a[r]=a[n-1];
            n--;
        }
        //print the sorted array 
        Arrays.sort(b);
       System.out.println("Bet the following combination.It'll make you rich!");
       for(int r: b)
           System.out.println(r);
    }
    }
