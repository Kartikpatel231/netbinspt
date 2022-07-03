/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stringee;

/**
 *
 * @author abc
 */
public class stringquestion {
public static void main(String[] ar){
  pattearch("1234555.4323");
    patSearch("kartikpatel","pate");
 

}
public static void pattearch(String no){
    int  pos=no.indexOf('.');
    while(pos<0){
        System.out.println(no+"");
    System.out.println(pos+1);     
    }
        //return ;
   
       
}
    public static void patSearch(String txt,String pat){


    int pos=txt.indexOf(pat);
   while(pos>=0){
       System.out.println(pos+"");
       pos=txt.indexOf(pat,pos+1);
   }
}

}
