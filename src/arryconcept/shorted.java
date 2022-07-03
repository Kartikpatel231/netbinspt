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
public class shorted {
public static void main(String[] arg){
    Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            int page=countDigit(a,n);
             System.out.println(page);

         boolean ans=isSorted(a,n);
            if(ans==true){
                System.out.print("yes");
            }
            else
            {
                System.out.print("no");
            }

            
            
}

public static int countDigit(int a[],int n){
    int count=0;boolean isDistinct=true;
    for(int i=0;i<n;i++){
        for(int j=(i-1);j>=0;j--){
            if(a[i]==a[j]){
                isDistinct=false;
                break;
            }
            if(isDistinct==true){
                count++;
            }
        }
    }
    return count;
}
public static boolean isSorted(int a[],int n){
    for(int i=1;i<n;i++){
        if(a[i]<a[i-1]){
            return false;
            
        }
       }
    return true;
}
 
}
