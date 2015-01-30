package me.danielcrawley.compsci.term1;

import java.util.Scanner ;
public class stalker{
  public static void main(String[]args){
   Scanner console = new Scanner(System.in); 
    System.out.println("What is your address?");  
    System.out.println("Use Format: Number Street City State Zip") ; 
    String address = console.nextLine() ;
     
    int num = address.indexOf(" "); 
    String number =address.substring(0, num);
    
    int streetLetter = address.indexOf(" ", num + 1); 
    int streetType =address.indexOf(" ", streetLetter);
      String street = address.substring(num, streetType); 
      
    int town = address.indexOf(" ",streetType + 1); 
    String city = address.substring(streetType, town + 1); 
    
    int statenum = address.indexOf(" ", town + 1); 
    String state = address.substring(town, statenum);
   
      
  }
  
  
}
  
 
  