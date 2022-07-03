/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stringee;

/**
 *
 * @author abc
 */
public class Stringbuilder {
    public static void main(String[] ar){
        //length(),CharAt(index),indexOf(str),indexOf(str,fromIndex)
        //lastIndexOf(str),lastIndexOf(str,fromIndex),compareTo(str)
        //substring(beginIndex),substring(beginIndex,endIndex) Chars()
        //new Methods:
        //append(x),insert(offset,x),setCharAt(index,c),reverse()
        //deleteCharAt(index),delete(start,end),capacity(),replace(start,end,str)
    StringBuilder s1=new StringBuilder("kartik");
    s1.reverse();
    System.out.println(s1);
    s1.append("patel");
    System.out.println(s1);
    s1.setCharAt(1, 'a');
    System.out.println(s1);
    s1.delete(1, 2);
    System.out.println(s1);
    s1.insert(1,"patel");
    System.out.println(s1);
    }
    
}
