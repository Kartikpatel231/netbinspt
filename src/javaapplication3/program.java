/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/** 
 * Program to initialize an object using default constructor in box class
 * using Scanner Class
 * @author abc
 */
class box{
    double width;
    double height;
    double depth;
    void volume(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
        System.out.print("Volume is=");
        System.out.println(width*height*depth);
    }
}
public class program {
    public static void main(String[] arg){
        box b1=new box();
        box b2=new box();
      double vol;
        Scanner obj=new Scanner(System.in);
    System.out.println("Enter the value for first object \n 1)width \n 2) height \n 3) depth");
    b1.width=obj.nextInt();
    b1.height=obj.nextInt();
    b1.depth=obj.nextInt();
    System.out.println("Enter the value for second  objects \n 1)width \n 2) height \n 3) depth");
     b2.width=obj.nextInt();
    b2.height=obj.nextInt();
    b2.depth=obj.nextInt();
    System.out.println("For object 1");
    b1.volume(b1.width,b1.height,b1.depth);
        System.out.println("For object 2");
    b2.volume(b2.width,b2.height,b2.depth);
    }}
