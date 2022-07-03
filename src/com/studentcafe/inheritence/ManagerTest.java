
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentcafe.inheritence;

import java.util.*;

/**
 *
 * @author abc
 */
public class ManagerTest {
public static void main(String[] args){
    //construct a manager object
    Manager boss=new Manager("Kartik patel",80000,2002,7,7);
    boss.SetBonus(8000);
    Employee[] staff=new Employee[3];
    staff[0]=boss;
    staff[1]=new Employee("Mohit titu",4000,2002,10,3);
    staff[2]=new Employee("Arvind titu",4000,2001,11,3);
for(Employee e:staff)
    System.out.println("name="+e.getName()+",salary="+e.getSalary());
}    
}
class Employee
{
    public Employee(string n,double s,int year, int months,int day)
{
    name=n;
    salary=s;
    GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
    hireDay=calendar.getTime();
}
    public String getName();
    {
        return name;
        
    }
public double getSalary()
{
    return salary;
}
public Date getHireDay()
{
    return hireDay;
}
public void raiseSalary(double byPercent)
{
    double raise=salary * byPercent/100;
    salary +=raise;
}
private String name;
private double salary;
private Date hireDay;
}
class Manager extends Employee
{
    public Manager(String n,double s,int year,int month,int day)
    {
            (n,s,year,month,day);
    bonus=0;
    }
public double getSalary()
{
double baseSalary=super.getSalary();
return baseSalary + bonus;
}
public void setBonus(double b)
{
bonus=b;
}
private double bonus;
}

