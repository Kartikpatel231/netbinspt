/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveAndNonPrimitive;

/**
 *
 * @author abc
 */
public class typeconversion {
    Integer d;
    int k=d;
    Integer m;
    int r=m;
    Integer lemp;
    int p=lemp;
   
 
     
   public static void main(String[] ar){
         int a=5;
    Integer x1=a;
    int x2=x1;
    if(a==x2)
    {
        System.out.println("same value");
    }
    else{
        System.out.println("diffrent value");
    }
        System.out.println(a);
        System.out.println(x1);
        System.out.println(x2);
     int b=5;
  int c=6;
  //swap this two number;
  
  int      temp =b;
          b=c;
          c=temp;
          System.out.println(b+""+c);
           typeconversion  ov=new  typeconversion();
        
          ov.d=5;
          ov.m=9;
          //System.out.printl(d);
    }
    
}
