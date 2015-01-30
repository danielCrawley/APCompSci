package me.danielcrawley.compsci.term2;

public class studentAdvanceTicket extends advanceTicket{
  public studentAdvanceTicket(int number, int days){
   super(number, days);  
  }
  public double getPrice(){
  return ((super.getPrice())/2); 
  }
  public String toString(){
   return ("Number: " + number + ", Price: " + getPrice() + " (ID required)");  
  }

}