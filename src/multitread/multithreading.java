/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multitread;

/**
 *
 * @author abc
 */
public class multithreading extends Thread {
    public static void main(String args[])throws Exception{
        for(int i=0;i<4;i++){
            sleep(1000);
            System.out.println("Thread");
        }
    }
}
