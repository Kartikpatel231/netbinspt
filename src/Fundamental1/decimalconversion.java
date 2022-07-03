/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamental1;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class decimalconversion {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
    int sum=in.nextInt();
    int sb=in.nextInt();
        int ans=get(sum,sb);
        System.out.println(ans);
        
        
    }
   
    
   public static int get(int sum,int sb){
        int multipler=1;
         int ans=0;
        while(sum!=0){
            int rem=sum%10;
            ans=ans+(rem*multipler);
             multipler=multipler * sb;
            sum=sum/10;
        }
        return ans;
    }
            
    
}
