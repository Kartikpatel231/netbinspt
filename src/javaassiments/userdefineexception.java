/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;
import java.io.*;
/**
 *
 * @author abc
 */
 class userdefineexception extends Exception {
    userdefineexception(String message)//throws IOExceptions
    {
        super(message);
    }
 }
    class excage
    {
        public static void main(String[] args){
        try
        {
    DataInputStream dis=new DataInputStream(System.in);
System.out.println("enter the age:");
int age=Integer.parseInt(dis.readLine());
if(age<0)
{
    throw new userdefineexception("negative age");
}
System.out.println("valid age="+age);
        }
        catch(Exception e)
        {
System.out.println(e);
        }
    }
 }
 