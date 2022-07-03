/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;

/**
 *
 * @Kartik Patel
 */
public class CanditionalOpertors {
    public static void main(String args[]){
        int a,b,c,max=0,min=0;
        a=20;
        b=30;
        c=45;
    max=((a>b)?((a>c) ? a:c) :(b>c)?b:c);
    min=((a<b)?((a<c) ? a:c) :(b<c)?b:c);
    min=((a<b)?((a<c) ? a:c) :(b<c)?b:c);
    System.out.println("The lagrest Number is="+max);
    System.out.println("The Smallest Number is="+min);
    }
}
