/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
/**
 *Program to use sleep() method
 * @author Kartik Patel
 */
class Threaddemo implements Runnable{
    String name;
    Thread t;
    Threaddemo(String tname){
        name=tname;
        t=new Thread(this.name);
        t.start();
    }
    public void run(){
        try{
            for(int i=1;i<=5;i++){
            System.out.println(name+"="+i);    
            Thread.sleep(100);
            }
        System.out.println("End of="+name);
    }
    catch(Exception e){}
}
}
 class ThreadDemo{
    public static void main(String args[]){
        Threaddemo nt1=new Threaddemo("Thread1");
        System.out.println("Thread1 is alive"+nt1.t.isAlive());
          Threaddemo nt2=new Threaddemo("Thread2");
        System.out.println("Thread1 is alive"+nt2.t.isAlive());
          Threaddemo nt3=new Threaddemo("Thread3");
        System.out.println("Thread1 is alive"+nt3.t.isAlive());
    try{
        nt1.t.join();
        nt2.t.join();
        nt3.t.join();
    }
    catch(Exception e){}
    System.out.println("Thread1 is alive = "+nt1.t.isAlive());
    System.out.println("Thread2 is alive = "+nt2.t.isAlive());
    System.out.println("Thread3 is alive = "+nt3.t.isAlive());
    System.out.println("End of main");
    }
    
}