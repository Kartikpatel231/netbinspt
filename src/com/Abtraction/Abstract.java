/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abtraction;

/**
 *
 * @author abc
 */
abstract class Shape
{
    abstract void draw();
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("dreawing rectangle");
        
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("dreawing a circle");
    }
    }
    class Abstract {
    public static void main(String args[])
    {
        Rectangle s=new Rectangle();
        s.draw();
        
    }
}
