/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicesession;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author abc
 */
interface hidden{
      void  set();
      public void get();
}
abstract class hidden1{
    
    int a,b;
public int set(int a ,int b){
    this.a=a;
    this.b=b;
    return a+b;
}
}
public class test1 extends hidden1 implements hidden{
      public void set(){
        System.out.println("This is set ");
    }
    public void get(){
        System.out.println("This is get");
    }
    
    public int set(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        test1 ob=new test1();
        ob.set();
        ob.get();
         Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
        System.out.println("enter the value of a and b");
        ob.set( a, b);
        System.out.println("value of a and b is"+ob.set(a,b));
    }
}
