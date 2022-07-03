/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
/**
 *Program to use Factory method to create inner class object
 * @author Kartik
 */
class Outer{
   class Inner{
        private int x=10;
        public int getX(){
            return x;
        }
  }
        public Inner createInner(){
                return new Inner();
    }
     public void show(){
         Inner inr= createInner();
         System.out.println("x:"+inr.getX());
     }
       class Inner1{
            protected int y=10;
            public int getY(){
                return y;
            }
            public int sum(){
                return y;
            }
           
            }
        public Inner1 createInner1(){
            return new Inner1();
        }
  public void show1(){
         Inner1 inr= createInner1();
         System.out.println("Y:"+inr.getY());
}
  
}
public class Factorymethod {
    public static void main(String[] arg){
        Outer otr=new Outer();
        otr.show();
        otr.show1();
    }
}

