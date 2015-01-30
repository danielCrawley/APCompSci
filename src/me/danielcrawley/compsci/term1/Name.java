package me.danielcrawley.compsci.term1;

import java.util.*;
public class Name{
  public static void main  (String[]args){
   Scanner console = new Scanner(System.in); 
   graduation(3.85, 190, 15);
   
   
   console.close();
  }
  public static void longestName(Scanner console, int a) {
   String [] names = new String[a]; 
   for (int i = 0; i < names.length; i++){
    System.out.println("name " + (i + 1) + ":"); 
      names[i] = console.nextLine(); 
    }
   int rightIndex = 0; 
   boolean tie = false; 
   for(int i=1; i<names.length; i++){
     
     if (names[i].length()>names[rightIndex].length()){
       rightIndex = i; 
     }}
     for (int i = 0; i<names.length; i++){
      if(names[i].length()== names[rightIndex].length() && i!= rightIndex){
       tie = true; 
     } 
     }
   
   System.out.println(names[rightIndex]+ "'s name is longest"); 
   if(tie){
    System.out.println("There was a Tie!");  
   }
  }
  
  @SuppressWarnings("unused")
  public static void threeHeads(){
   Random rand = new Random();
   int heads = 0; 
   while (heads!=3){ 
     int flip = rand.nextInt(2);  
       if (flip == 0){
      System.out.print("T "); 
        heads = 0; 
     }
     if(flip == 1){
      System.out.print("H ");
       heads++; 
       if(heads == 3){
        System.out.println("");  
       }
     }
   }
    System.out.println("Three Heads in a Row!"); 
    
  }
  public static void graduation(double gpa, int credits, int honours){
    if (gpa>=2.0 && credits >=180){
      if (gpa<3.6){
       System.out.println("graduating");  
      }
      else if (honours<15){
        if (gpa>=3.6 && gpa<3.8){
         System.out.println("cum laudae");  
        }
        else{
         System.out.println("magna cum laudae");  
        }
        
      }
      else if (honours >=15){
        if (gpa>=3.6 && gpa<3.8){
         System.out.println("magna cum laudae");  
        }
        else{
         System.out.println("summa cum laudae");  
        }
        
    } 
    }
    else{
      System.out.println("not graduating"); 
    }
  }


}

