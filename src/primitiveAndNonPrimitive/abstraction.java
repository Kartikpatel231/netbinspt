/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveAndNonPrimitive;

/**
 *
 * @author abc
 */
abstract class ram{
void get(){
    System.out.println("This is abstract class");
}
}
public class abstraction extends ram {
    void get(){
        System.out.println("this is normal class");
    }
    public static void main(String[] args){
        abstraction obj=new abstraction();
        obj.get();
    }
    
}
