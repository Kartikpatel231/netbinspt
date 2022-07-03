/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arryconcept;
import java.util.*;
/**
 *
 * @author Kartik Patel
 */
public class Quikshort {
    int roll;
    String name;
     void setName(int r,String n)
    {
        roll=r;
        name=n;
    }
    void getName()
    {
     System.out.println("your roll number="+roll+"your name="+name);
    }
static void swap(int[] arg,int i,int j){
  int temp=arg[i];
  arg[i]=arg[j];
  arg[j]=temp;
    }
static int partition(int []arg,int s,int e)
{
int pivot=arg[e];
int i=(s-1);
for(int j=s;j<=e-1;j++)
{
if(arg[j]<pivot)
{
    i++;
    swap(arg,i,j);
}
}
swap(arg,i+1,e);
return (i+1);

}
static void partition1(int [] arg,int s,int e)
{
    if(s<e)
    {
        int pi=partition(arg,s,e);
        partition(arg,s,pi-1);
        partition(arg,pi+1,s);
    }
}
static void printArray(int[] arg,int size)
{
   // Scanner in=new Scanner(System.in);
  //System.out.println("enter the size of array");
  //int size=in.nextInt();
  //System.out.println("enter the arrray"+size);
  //int arg[]=new arg[size];
    for(int i=0;i<size;i++){
        System.out.println(arg[i]+ "  ");
    System.out.println();
    }
}
public static void main(String[] ars)
{
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the no.of size of array");
    int n=in.nextInt();
    System.out.print("input the size"+n+"of array");
    int arg[]=new int[n];
    for(int i=0;i<n;i++)
    {
    arg[i]=in.nextInt();//{10,7,8,9,1,5};
    //int n= arg.length;
    }
    partition(arg,0,n-1);
    System.out.println("Sorted array:");
    printArray(arg,n);
    Quikshort p1=new Quikshort();
    p1.setName(123, "kartik");
    p1.getName();
    
}
}
