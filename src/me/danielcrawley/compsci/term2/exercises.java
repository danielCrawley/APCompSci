package me.danielcrawley.compsci.term2;

import java.util.*;
public class exercises{
  public static void main (String[] args){
    List<String> name = new ArrayList<String>(); 
    name.add("no"); name.add("yes"); 
   
    System.out.println( reverse(name) ); 
    
  }
  public static List reverse(List <String> other){
   List <String> listyList = new ArrayList<String>(); 
   for(int i = other.size()-1; i>0; i--){
    listyList.add(other.get(i));  
   }
   return listyList; 
  }
}