/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveAndNonPrimitive;
import java.util.Scanner;
/**
 *
 * @author abc
 */
public class loop {
    public static void main(String[] ar){
       Scanner in=new Scanner(System.in);
        System.out.print("enter the no of n");
        int n=in.nextInt(); //no of row
        //int i=in.nextInt(); //no of coloumn
        int i=0;
        while(i<n){
            int j=1;
            while(j<=(n-i)){
         System.out.print(" ");
            j++;
            }
        while(j<=n)
        {
         System.out.print("*");
         j++;
        }
    i++;
    System.out.println("");        }
    int k=1;
        while(k<n){
            System.out.println(k*n);
            k++;
        
    }
        int m=1;
        while(m<=n){
            int p=1;
            while(p<(n-m)){
                System.out.print(" ");
                p++;
                }
            int r=1;
            while(r<=(2*m-1)){
            System.out.print("*");
            r++;
        }
            m++;
            System.out.println(" ");
        }
        int t=1;
        while(t<=n){
            int u=1;
            while(u<=(2*t-1)){
                System.out.print(" ");
                u++;
                
            }
           int w=1;
            while (w<(n-t)){
                System.out.print("*");
            }
            t++;
           // System.out.println(" ");
        }
        int l=4567;
        int count=0;
        while(l!=0)
        {
            l /=10;
            ++count;
        }
        System.out.println(count);
    }    
}
