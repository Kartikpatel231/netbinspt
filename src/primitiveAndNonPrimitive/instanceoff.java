/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveAndNonPrimitive;

/**
 *
 * @author abc
 */
//instanceof in java is also known as type comparison operator because it 
 //compares the instance it returns either thrue
 class instanceoff {
    
    
}
class Dog1 extends instanceoff
{//we are extends instanceoff class in dog so we can access it 
    public static void main(String[] args){
        Dog1 d=new Dog1();
        System.out.print(d instanceof instanceoff);
    }
}
