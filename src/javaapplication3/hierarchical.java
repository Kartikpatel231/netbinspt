/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *Hierarchical program in java
 * @author abc
 */
class student{
    private String name;
    private int roll;
    void set(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Roll :"+roll);
    }
}
class Science extends student{
    private int chem,bio,phy;
    void set(int a,int b,int c){
        super.set("Student", 1);
        chem=a;
        bio=b;
        phy=c;
    }
    void display(){
        super.display();
        System.out.println("Chemistry :"+chem);
        System.out.println("Biology :"+bio);
        System.out.println("Physics :"+phy+"\n");
    }
}
class commerc extends student{
    private int ac,bom,st;
    void set(int a,int b,int c){
        super.set("student 1", 2);
        ac=a;
        bom=b;
        st=c;
    }
    void display(){
        super.display();
        System.out.println("Account :"+ac);
        System.out.println("BOM :"+ac);
        System.out.println("ST :"+st+"\n");
    }
}
class Art extends student{
    private int sanskrit,psychology,philosophy;
    void set(int a,int b,int c){
    super.set("Student 2", 3);
    sanskrit=a;
    psychology=b;
   philosophy=c;    
}
    void display(){
        super.display();
        System.out.println("Sankrit :"+sanskrit);
        System.out.println("Psychology :"+psychology);
        System.out.println("Philosophy :"+sanskrit);
    }
}
public class hierarchical {
    public static void main(String[] ar){
        student stu=new student();
        Science obj=new Science();
        commerc obj1=new commerc();
        Art obj2=new Art();
    
        obj.set(100,90,80);
        obj.display();
        
        obj1.set(60,70,80);
        obj.display();
    
       obj2.set(90, 100, 30);
       obj2.display();
    }
}
