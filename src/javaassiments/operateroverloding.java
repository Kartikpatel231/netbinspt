/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
public class operateroverloding {
    int n,c;
    double k,r,d;
    void get(int m,int f){
        n=m;
        k=f;
        c=m+f;
            System.out.println(c);
           
        }
    void get(double m,double f){
        r=m;
        k=f;
        d=r*k;
        
      System.out.println(d);
    }
      
public static void main(String[] args){
    operateroverloding obj=new operateroverloding();
    obj.get(2,3);
    obj.get(1.2,3.1);
}
    
}
