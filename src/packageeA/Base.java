/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageeA;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class Base {
   
     int id;
     String name;
    //String enrollement;
    String address;
   String str;
    public Base(){
        System.out.println("base package");
        Scanner obj=new Scanner(System.in);
        System.out.println("Id,name,address");
        id=obj.nextInt();
        obj.nextLine();
        name=obj.nextLine();
        obj.nextLine();
        address=obj.nextLine();
        
    
    
        System.out.println("Base class");
        System.out.println(" id-:"+id);
        System.out.println("Name-:"+name);
        System.out.println("Address-:"+address);
    
}
}