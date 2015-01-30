package me.danielcrawley.compsci.term1;

import java.util.Random;
import java.util.Scanner;

public class gameOfCount{
  public static void main (String[]args){
   Random randy = new Random();
   Scanner console = new Scanner(System.in);
   int wrong = 0; 
   int right = 0; 
   while (wrong < 3){
    int total = 0; 
    int summands = randy.nextInt(3) +2; 
      for (int i = 0;i <= summands; i++){
        int summand = randy.nextInt(10) +1; 
         if (i != summands){
          System.out.print(summand + " + ");  
         }
         else{
          System.out.print(summand + " =");  
         }
       total+=summand;
      }
    int answer = console.nextInt(); 
     if (answer == total){
       right ++;
     }
     else{
       wrong++; 
       System.out.println("Wrong! The Answer is " + total); 
     }
   }
   System.out.println("You have three wrong answers. Nice try! You got " + right + " question(s) right.");
  }
 }
  
  
  
  
  
