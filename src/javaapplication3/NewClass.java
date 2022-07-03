/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
/**
 *Program to explain Importing package.
 * @author Kartik
 */
class Balance{
    String name;
    int balancee;
public void getDetail(String n,int b){
    name=n;
    balancee=b;}
public void showDetail(){
    if(balancee<0) 
        System.out.println("--------------");
        System.out.println(name+":Rs-"+balancee);
}}
public class NewClass {
 public static void main(String[] args){
      Balance obj=new Balance();
      obj.getDetail("kartik",1000);
      obj.showDetail();
      obj.getDetail("Ram",1001);
      obj.showDetail();
      obj.getDetail("Shubham",1002);
      obj.showDetail();
      }}