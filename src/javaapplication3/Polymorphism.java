/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *Simple Polymorphism with Abstract class.
 * @author kartik
 */
abstract class color{
    abstract void color();
    abstract void shape();
}

class color1 extends color{
    void color(){
        System.out.println("This is yellow colour");
    }
    void shape(){
        System.out.println("owl");
    }
}
class color2 extends color1{
    void color(){
        super.color();
        System.out.println("This is Aqua colour");
    }
    void shape(){
        super.shape();
        System.out.println("circle");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        color2 c=new color2();
        c.color();
        c.shape();
  
    }
}
