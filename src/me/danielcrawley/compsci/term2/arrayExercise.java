package me.danielcrawley.compsci.term2;

import java.util.*;
public class arrayExercise{
  public static void main (String[]args){
    ArrayList<String> stringy = new ArrayList<String>(); 
    stringy.add("fat"); stringy.add("bats"); 
    capitalizePlurals(stringy); 
    System.out.println(stringy);
    removePlurals(stringy); 
    System.out.println(stringy);
  }
  public static void capitalizePlurals(List <String> other){
    for(int i =0;i<other.size();i++){
      if(other.get(i).endsWith("s")){
       String temp = other.get(i).substring(0,1).toUpperCase() + other.get(i).substring(1);
       other.set(i, temp); 
      }
    }
  }
  public static void removePlurals(List<String> other){
    for(int i =other.size()-1; i>0; i--){
     if(other.get(i).endsWith("s"))
       other.remove(i); 
    }
  }
  
  
}