/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
interface Drawable{
    public void draw();
}

public class lamdaexpression {
public static void main(String[] args){
    int width=10;

    Drawable d=()->{
    System.out.println("Deawing "+width);
};
d.draw();
}    

}
