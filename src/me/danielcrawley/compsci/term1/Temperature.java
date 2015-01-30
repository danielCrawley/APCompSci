package me.danielcrawley.compsci.term1;

import java.util.*;
public class Temperature{
  public static void main (String[]args){
   Scanner console = new Scanner(System.in); 
   System.out.println("Enter the number of days"); 
   double[] temp = new double[console.nextInt()]; 
   for (int x = 0; x<=(temp.length- 1); x++){
    System.out.println("Day " + (x + 1) + " temperature: "); 
    temp[x] = console.nextDouble(); 
   }
   double total = 0;
   for (int x=0; x<= temp.length-1; x++){
    total+=temp[x];
   }
  double average = total/temp.length;
   System.out.println("Average: " + average + " degrees."); 
  int above = 0;
  int below = 0;
  for(int x =0; x<temp.length; x++){
    if(temp[x] > average){
      above++;
  }
    if (temp[x]<average){
     below++;  
    }
  }
  System.out.println("Days above average: " + above); 
  System.out.println("Days below average: " + below); 
  Arrays.sort(temp);
  System.out.println("Temp of Two Hottest Days: " + temp[temp.length - 1] + " " + temp[temp.length - 2]); 
  System.out.println("Temp of Two Coldest Days: " + temp[0] + " " + temp[1]);
  
  
   console.close();
   
}
}