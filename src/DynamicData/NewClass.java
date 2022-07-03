/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicData;
import java.util.Scanner;
/**
 *
 * @author kartik patel
 */
public class NewClass {
    public static void main(String[] ar){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
       // int b=in.nextInt();
        boolean flag1=true;//,flag2=true;
        int i=2;
        for(i=2;i<a;i++)
        {
        if(a%i==0){
            System.out.print("not a prime number");
             flag1=false;
            
        }
        
       
        }
        if(flag1)
            System.out.println(a+"is prime");
        else
            System.out.println(a+"not a prime");
  
    }
    
    
}
