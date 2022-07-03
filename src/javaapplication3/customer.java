/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author abc
 */
class Customerr{
    String id;
    String Name;
    long contact;
    String Address;
    Customerr(String CName, String Cid, long Ccontact, String CAddress){
        Name=CName;
        id=Cid;
        contact=Ccontact;
        Address=CAddress;
    }
   public void set(){
       System.out.println(Name+" "+id+" "+contact+" "+Address);
   }
}
public class customer{
    public static void main(String[] args){
        Customerr Customer1=new Customerr("kartik","101",79993019,"Ajnod");
        Customer1.set();
    }
}
/*class Customer{
    public String customerId;
    /*private String customerName;
    private long contactNumber;
    private String address;*/
/*     Customer(String customerId)//, String cName, long contact, String add){
     {this.customerId=  customerId;
      /*  cName=customerName;
        contact=contactNumber;
        add=address;*/
  /*     System.out.println(customerId);//+" "+cName+""+contact+" "+add); 
       
    }
     public int set(){
        System.out.println(customerId);//+" "+customerName+""+contactNumber+" "+address); 
        return 0;
    }
   
}
public class customer {
    public static void main(String args[]){
     //  Customer customer1=  new Customer("c103","Java_core_Trick",799930194,"Indore");
 //     System.out.println("print name"+customer1.Customer("c103","Java_core_Trick",799930194,"Indore");
   
        new Customer("kartik");//, "Java_core_Trick" , 79993, "Indoree");
        //System.out.println(co.set());

    }
}
*/