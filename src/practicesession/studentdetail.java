/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicesession;
import java.util.*;
import java.lang.*;
import java.time.formate.LocalDateTimeFormatter;
import java.time.formate.DateTimeFormatter;



      
/**
 *
 * @author abc
 */
 interface TimeClient{
void setTime(int hour,int minute,int second);
void setDate(int day,int month,int year);
void setDateAndTime(int day,int month,int year,int hour,int minute,int second);
LocalDateTime getLocalDateTime();
}
 class studentdetail implements TimeClient{
private LocalDateTime dateAndTime;
public studentdetail(){
    dateAndTime=LocalDateTime.now();
}
public void setTime(int hour,int minute,int second){
    LocalDate currentDate=LocalDate.from(dateAndTime);
    LocalTime timeToSet=LocalTime.of(hour,minute,second);
    dateAndTime=LocalDateTime.of(currentDate,timeToSet);
}
public void setDate(int day,int month,int year){
    LocalDate dateToSet=LocalDate.of(day,month,year);
    LocalTime currentTime=LocalTime.from(dateAndTime);
    dateAndTime=LocalDateTime.of(dateToSet,currentTime);
}
public void setDateAndTime(int day,int month,int year,int hour,int minute,int second){
    LocalDate dateToSet=LocalDate.of(day,month,year);
    LocalTime timeToSet=LocalTime.of(hour,minute,second);
    dateAndTime=LocalDateTime.of(dateToSet,timeToSet);
}
public LocalDateTime getLocalDateTime(){
    return dateAndTime;
}
public String toString(){
    return dateAndTime.toString();
}
public static void main(String[] args){
    TimeClient myTimeClient=new studentdetail();
    System.out.println(myTimeClient.toString());
}
}

