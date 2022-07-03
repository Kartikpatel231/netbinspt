/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;

/**
 *
 * @author Kartik
 */
public class Core_Java_Relational_Operators {
public static void main(String[] args){

        
double sales,commession;
sales=10000;
if(sales<9000){
    commession=0;}
else{
    if(sales<10000){
        commession=sales*0.05;}
    else{
        if(sales<20000){
            commession=sales*0.1;}
        else{
            if(sales<30000){
                commession=sales*.12;}
            else{
                commession=sales*0.15;
            }}}}
System.out.println("The Commission is="+commession);
}    
}
