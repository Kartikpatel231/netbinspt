/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
public class cammandlineargument {
    public static void main(String[] args){
          System.out.println("The command-line arguments are");
        for (int x = 0; x < args.length; x++)
            System.out.println("args[" + x + "]: " + args[ x ]);
    }
    
}
