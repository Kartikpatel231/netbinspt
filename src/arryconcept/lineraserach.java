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
public class lineraserach {
 static int linearSearch(int arg[],int n,int key )
{
    for(int i=0;i<n;i++)
    {
        if(arg[i] == key){
            return i;
        }
    }
    return -1;
}
    public static void main(String []ars)
    {
         Scanner in=new Scanner(System.in);
         System.out.println("enter the number of element ");
   int n=in.nextInt();
  // System.out.println("enter the size of you wanna to linear search");
    int arg[] =new int[n];
    System.out.println("enter"+ n +"integer");
     //arg[n]=in.nextInt();
    for(int i=0;i<n;i++){
        arg[i]=in.nextInt();     
    }  
   System.out.println("pls enter the key");
    int key=in.nextInt();
   int pos=linearSearch(arg,n,key);
   if(pos== -1)
   {
       System.out.println("key is not found");
   }
   else
   {
       System.out.println("key  is found at index"+pos);
   }
    }
    

}
