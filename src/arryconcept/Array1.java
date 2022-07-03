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
public class Array1 {
    public static void main(String []ars){
       
       
       
 
        Scanner in=new Scanner(System.in);
               //int n;
               int n=in.nextInt();
                int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=i+1;
        System.out.println(a[i]);
    }
        for(int i=0;i<n;i++)
        System.out.println("array element is"+a[i]);
    }
    
}
