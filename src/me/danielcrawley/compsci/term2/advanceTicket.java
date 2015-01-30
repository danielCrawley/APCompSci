package me.danielcrawley.compsci.term2;

public class advanceTicket extends ticket{
  public int daysAdvance; 
  public advanceTicket(int number, int days){
   super(number);  
   daysAdvance = days; 
  }
  public double getPrice(){
    if (daysAdvance>= 10)
      return 30; 
    else{ 
      return 40; 
    }
   }
}