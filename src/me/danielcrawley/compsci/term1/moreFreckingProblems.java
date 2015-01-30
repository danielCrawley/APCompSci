package me.danielcrawley.compsci.term1;

import java.util.*;
public class moreFreckingProblems{
  public static void main (String[]args){
  System.out.println(consecutiveDigits(82888));  
  }
  public static int consecutiveDigits(int n){
    int lastNum = -1; 
    int consecutive =1; ; 
    while (n>0){
      if(n % 10 == lastNum){
       consecutive++;  
      }
    
    lastNum = n%10; 
    n = n/10; 
    }
    return consecutive; 
  }

}

