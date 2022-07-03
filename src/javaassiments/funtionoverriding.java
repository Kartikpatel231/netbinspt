/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
 class funtionoverriding {
     void  funtionoverriding()
    {
        System.out.print("my name is kartik patel ");
    }
}
    class sub extends funtionoverriding
    {
        void funtionoverriding(){
        System.out.println("this is overriding funtion");
    }
    }
    class overriding{
    public static void main(String[] args){
        funtionoverriding obj=new funtionoverriding();
        obj.funtionoverriding();
        funtionoverriding obj1=new sub();
        obj1.funtionoverriding();
        sub obj2=new sub();
        obj2.funtionoverriding();
    }
}

