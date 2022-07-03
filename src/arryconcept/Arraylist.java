/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arryconcept;
import java.util.ArrayList;
//import java.util.ArrayList;
/**
 *
 * @author abc
 */
public class Arraylist {
public static void main(String[] ar){
    ArrayList<Integer>al=new ArrayList<Integer>();
  ArrayList<Character>to=new ArrayList<Character>(10);
  ArrayList<String>fo=new ArrayList<String>();
fo.add("geeks");
fo.add("kartik");
System.out.print(fo.contains("geeks"));
fo.remove(0);
fo.add(1,"practice");
System.out.println(fo.contains("geeks"));
for(int i=1;i<10;i++)
  to.add('c');
    al.ensureCapacity(10);
    System.out.print(al);
    System.out.print(to);
}    
}
