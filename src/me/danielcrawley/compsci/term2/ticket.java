package me.danielcrawley.compsci.term2;

public class ticket{
public int number; 
public ticket(int number){
this.number = number;   
}
public double getPrice(){
 return 0.0;   
}
public String toString(){
 return ("Number: " + number + " Price: " + getPrice());  
}
}