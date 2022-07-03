/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveAndNonPrimitive;

/**
 *
 * @author abc
 */
interface Show{
    void print();
}
interface show1 extends Show{
   void print();
}
   public class interfarance  implements show1{
    public void print(){
        System.out.println("kartik patel ");
    }
    public static void main(String[] args){
        interfarance obj=new interfarance();
        obj.print();
        
    }
    
}
