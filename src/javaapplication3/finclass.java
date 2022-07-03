/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *Program to explain final class restricts
 * The inheritance from that class
 * @author Kartik Patel
 */
final class city{
              void set(){
        System.out.append("Your city name");
    }
    void display(){
        Scanner obj=new Scanner(System.in);
             String ci=obj.nextLine();
        System.out.println("My city name is"+ci);
    }
}              //final class can not be inherited
class city1{
      void set(){
        System.out.println("Your city name");
    }
    void display(){
          Scanner obj=new Scanner(System.in);
        String ci=obj.nextLine();
        System.out.println("My city1 name is"+ci);
    }
}
public class finclass {
    public static void main(String[] args){
        city c=new city();
        city1 c1=new city1();
        c.set();
        c.display();
        c1.set();
        c1.display();
    }
}
