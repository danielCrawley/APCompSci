package me.danielcrawley.compsci.term1;

import java.util.Scanner ;
public class gansterName{
  public static void main (String[]args){
    Scanner console = new Scanner(System.in) ; 
    System.out.println("What is your name?"); 
    String name = console.nextLine() ; 
    String first = name.substring(0, name.indexOf(" ")); 
    String last = name.substring(name.indexOf(" "));
    System.out.println("Your name is " +  (name.substring(0,1)).toUpperCase() + ". Diddy" + last.toUpperCase() + " "   + first + "-izzle");   
    console.close(); 
    
    
  }
  
  }