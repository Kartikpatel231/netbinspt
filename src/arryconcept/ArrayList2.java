/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arryconcept;
import java.util.ArrayList;
/**
 *
 * @author abc
 */
public class ArrayList2 {
    public static void main(String[] ar){
        ArrayList<Integer>al=new ArrayList<Integer>();
    al.add(10);
    al.add(20);
    al.add(30);
    al.add(40);
    System.out.println(al.get(1));
    al.set(1,50);
    System.out.println(al.get(1));
    System.out.println(al.isEmpty());
    al.clear();
    System.out.println(al.isEmpty());
    System.out.println(al.indexOf(10));
    System.out.println(al.lastIndexOf(10));
    System.out.println(al.indexOf(60));
    }
    
}
