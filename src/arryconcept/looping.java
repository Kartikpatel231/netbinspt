/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arryconcept;
import java.util.*;
/**
 *
 * @author abc
 */
public class looping {
   
    public static void main(String []ars)
    {
    String name,section;
    int roll;
    String[] txt= new String[2];
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name ,enter your roll,and also section and smester");
                 name=in.nextLine();
                 roll=in.nextInt();
                 txt[0]=in.nextLine();
              
                 int [] ram=new int[4];
                 ram[0]=1;
                 ram[1]=2;
                 for(int rama: ram)
                 {
                     System.out.println(ram);
                 }
                 for(String txte:txt)
                 {
                    // for(inttxt=0;txt<=2;txt++){
                         
//                     }
                        txt[0]=in.nextLine();
                       
                     System.out.println("your semestes and suour"+txt[0]);
                 }
                 //txt[2]=in.nextLine();
                 //section=in.nextharAts(0)();
        System.out.println("\n" + " you name=" + name);
        System.out.println(" you roll no=" + roll);
        //System.out.println("you section"+txt);
       // System.out.println("you are in \n "+txt);
        
    }
}
