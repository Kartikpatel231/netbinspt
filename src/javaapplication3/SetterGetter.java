/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
/**
 * ParameteriProgram to explainzed Constructor
 * with Object as Argument with Circle class
 * @author abc
 */
class Circle{
    private double Radiou ;
    Circle(){
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the radiou");
      Radiou=obj.nextInt();
    }
    Circle(double Radiou){
    this.Radiou=Radiou;
    }
    Circle(Circle obj){
        Radiou=obj.Radiou;
    }
     public double area(){
        return 3.14*Radiou*Radiou;
    }}
public class SetterGetter {
    public static void main(String[] arg){
  Circle obj= new Circle();
  Circle obj1=new Circle(obj);
        System.out.println("Area of Circle "+obj1.area()+".....!");
    }}
