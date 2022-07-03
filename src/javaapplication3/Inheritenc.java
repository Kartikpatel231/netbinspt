/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *Multiple inheritance example
 * @author abc
 */

class Boxes{
    private double width,height,depth;
    Boxes(Boxes ob){
       width=ob.width;
       height=ob.height;
       depth=ob.depth;
    }
    Boxes(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Boxes(){
        width=-1;
        height=-1;
        depth=-1;
    }
Boxes(double len){
    width=height=depth=len;
}
double volume(){
    return width*height*depth;
}
}
class BoxWeight extends Boxes{
    double weight;
    BoxWeight(BoxWeight ob){
        super(ob);
        weight=ob.weight;
    }
    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;
    }
    BoxWeight(){
        super();
        weight =-1;
    }
    BoxWeight(double len,double m){
        super(len);
        weight=m;
    }
}
class BoxCost extends BoxWeight{
    double cost;
    BoxCost(BoxCost ob){
        super(ob);
        cost=ob.cost;
    }
    BoxCost(double w,double h,double d,double m,double c){
        super(w,h,d,m);
        cost=c;
    }
    BoxCost(){
        super();
        cost=-1;
    }
    BoxCost(double len,double m,double c){
        super(len,m);
        cost =c;
    }
}
public class Inheritenc{
public static void main(String[] args){
BoxCost b1=new BoxCost(10, 20, 30, 40, 50.45);
BoxCost b2=new BoxCost(10, 5, 10, 20, 40.65);
double result;
result= b1.volume();
System.out.println("Volume of b1 is"+result);
System.out.println("Weight of b1 is"+b1.weight);
System.out.println("Cost: Rs," +b1.cost);
System.out.println();
 result=b2.volume();
System.out.println("Volume of b1 is"+result);
System.out.println("Weight of b1 is"+b2.weight);
System.out.println("Cost: Rs," +b2.cost);
System.out.println();
        
}    
}