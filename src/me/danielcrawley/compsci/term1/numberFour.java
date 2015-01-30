package me.danielcrawley.compsci.term1;

import java.util.*;
public class numberFour{
  public static void main (String[]args){
   System.out.println("there are " +countEvenDigits(8675309) + " even numbers");
   System.out.print(enoughTimeForLunch(12,30,13,00)); 
  }
  public static int countEvenDigits(int a){
   int evens=0; 
    while (a > 0){
      if(a % 2==0){
       evens++; 
      }
      a = a/10; 
    }
    return evens; 
  }
 
  public static boolean enoughTimeForLunch(int hourOne, int minuteOne, int hourTwo, int minuteTwo){
    if(hourTwo>=hourOne){
      if (hourTwo==hourOne){
        if(minuteOne+45<=minuteTwo){
         return true;  
        }
        return false; 
      }
      else{
        minuteTwo+=60; 
        if(minuteOne+45<=minuteTwo){
         return true;  
        }
        return false; 
      }
    }
    return false; 
  }
 
  public static void randomRects(){
    Random rand = new Random(); 
    int increasingArea = 0;
    int area; 
    while (increasingArea != 4){
      int width = rand.nextInt(10) +1; 
      int length = rand.nextInt(10)+1; 
      System.out.println("w: " + width);
      
    }
    
    
  }
  
  
  
  
  
}