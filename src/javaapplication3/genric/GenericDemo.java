/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.genric;

/**Simple Generic Class with two type parameter, Program
 * @author Kartik Patel
 */
class DemoTwoParamer<T,V> {    //two parameter pass(t & v)
      T ob1;
      V ob2;
       DemoTwoParamer(T o1, V o2) {      //constructor
        ob1 = o1;
        ob2 = o2;
    }
        T getob1() {                     //getmethod1
        return ob1;
    }
       V getob2(){                       //getmethod2
           return ob2;
       }
        void show() {                    //setmethod
        System.out.println("Type of T is" + ob1.getClass().getName());
        System.out.println("Type of V is" + ob1.getClass().getName());
    }
}
public class GenericDemo {           
    public static void main(String[] args) {
        DemoTwoParamer<Integer,String> obj = new DemoTwoParamer<>(1,"Nils");
        obj.show();
        int v = obj.getob1();
        System.out.println("Value:" + v);
        
        String str=obj.getob2();
        System.out.println("Value:" + str);
    }
}
