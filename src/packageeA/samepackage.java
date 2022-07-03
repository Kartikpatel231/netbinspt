/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageeA;

/**
 *
 * @author abc
 */
public class samepackage  extends derived{
    samepackage(){
        Base b=new Base();
        System.out.println("Same package constructor");
        System.out.println("Id-:"+b.id);
        System.out.println("name-:"+b.name);
        System.out.println("Address-:"+b.address);
    }
    
}
