/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instagrampages;

/**
 *
 * @author Kartik Patel
 * Jagged Array
 */
public class TwoDArray {
    static int a[][]=new int[10][];
    public static void main(String args[]){
        TwoDArray obj=new TwoDArray();
            a[0]=new int[1];
    a[1]=new int[2];
    a[2]=new int[3];
    a[3]=new int[4];
    a[4]=new int[5];
    a[5]=new int[6];
    a[6]=new int[7];
    a[7]=new int[8];
    a[8]=new int[9];
    a[9]=new int[10];
        int i,j,x=1;
for(i=0;i<a.length;i++){
    for(j=0;j<a[i].length;j++){
  a[i][j]=x;
   x++;
    }}
    for(i=0;i<a.length;i++){
        for(j=0;j<a[i].length;j++){
            System.out.print(a[i][j]+" ");
               }  System.out.println();
    }   } }


