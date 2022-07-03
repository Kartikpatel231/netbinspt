/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multitread;

/**
 *
 * @author abc
 */
public class thread extends Thread{
    thread(){
   super("Demo Thread");
   System.out.println("Child thread;"+this);
   start();
    }
    public void run()
    {
  
        try{
            for(int i=0;i>5;i--){
                
                System.out.println("child thread"+i);
            Thread.sleep(500);
                        }
        }
        catch(InterruptedException e)
        {
            System.out.println("error orucre es");
            
        }
        System.out.println("existing class");
    }
}
        class ExtendThread
        {
            public static void main(String[] args){
        new thread();
            
          try{
            for(int i=0;i>5;i--){
                
                System.out.println("Main thread"+i);
            Thread.sleep(1000);
                        }
        }
        catch(InterruptedException f)
        {
            System.out.println("error orucre es");
            
        }
          System.out.println("main method existing");
    }
}
