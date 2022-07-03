/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *Simple concept for object and classes;
 * @author abc
 */
class FindDistance{
    int speed;
    double time;
    double distance;
    public void get(int speed,double time){
        this.speed=speed;
        this.time=time;
        distance=speed*time;
        System.out.println("your speed and time is given \n"+speed+" \n"+time);
    }
    public void result(){
        System.out.println("the distance is="+distance);
    }}
public class classesandObject {
    public static void main(String[] ar){
        FindDistance obj=new FindDistance();
        obj.get(50,1.3);
        obj.result();
         }}
