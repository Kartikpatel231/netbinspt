/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
/**
 * Use InstanceOf operator
 * @author abc
 */
class Constructor1{
    Constructor1(){
      System.out.print("object is created.");  
    }
}
class Constructor2{
    Constructor2(){
        System.out.println("Object is created");
    }
}   

public class programs {
    public static void main(String[] arg){
 Constructor1 obj=new Constructor1();
 Constructor2 obj1=new Constructor2();
    if( obj instanceof Constructor1){
        System.out.println(" obj is an instance of class Constructor1");
    }
    else{
        System.out.println("obj is not an instance of class Constructor1");
    }
    if( obj1 instanceof Constructor2){
        System.out.println("obj is an instance of class Consturctor2");
    }
    else {
                System.out.println("obj is not instance of class Consturctor2");

    }
    }
}
