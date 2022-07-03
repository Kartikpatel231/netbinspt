/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arryconcept;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author abc
 */
public class Arraylisttraversal {
    public static void main(String[] ar){
        ArrayList<String>al=new ArrayList<String>();
        al.add("kartik");
        al.add("patel");
        al.add("prince");
        al.add("<mathur?");
        ArrayList<Integer>a2=new ArrayList<Integer>();
        a2.add(10);
        a2.add(20);
        a2.add(30);
        a2.add(40);
        a2.add(50);
    Iterator it=al.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next()+"");
    }
        Iterator is=a2.iterator();
      while(is.hasNext())
      {
          int x=(Integer)is.next();
          if(x<20)
          {        is.remove();
      }
          else
              System.out.println(x);
      
    
     // a2.forEach(y->System.out.println(y));
      }
}
}