package me.danielcrawley.compsci.term1;

import java.util.Random;
public class luckySeven
{public static void main (String[]args){
 Random randnum = new Random(); 
 int firstroll;
 int secondroll;
 int sum;
 int tries = 0;
 do {
    firstroll = randnum.nextInt(6) + 1; 
      secondroll = randnum.nextInt(6) + 1; 
   sum = firstroll + secondroll ;
      System.out.println (firstroll + " + " + secondroll + " = " + sum);
      tries++;
      
 } while (sum !=2) ;
   System.out.println("You got it after " + tries + " time(s)!"); 
   }
 }
  