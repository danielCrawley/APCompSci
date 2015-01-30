package me.danielcrawley.compsci.term2;

import java.util.Scanner;

public class Student
{ private int test1; 
  private int test2; 
  private String studentName; 
  Scanner console = new Scanner (System.in); 
    //declare instance data 

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {this.studentName = studentName; 
 //add body of constructor
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {System.out.println("Imput Test Grades"); 
      test1 = console.nextInt(); 
      test2 = console.nextInt(); 
 //add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage()//add header for getAverage
    {return ( (double) (test1 + test2)/2); 
 //add body of getAverage
    }
    public String getName(){
     return studentName;  
    }
    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public void printName()//add header for printName
    {System.out.print(studentName); 
 //add body of printName
    }
    public String toString(){
     return ("Name: " + this.studentName + " Test1: " + this.test1 + " Test2 " + this.test2); 
    }

}
