package me.danielcrawley.compsci.term2;

public class Grades //tester class
{
    public static void main(String[] args)
    {
 Student student1 = new Student("Mary");
 //create student2, "Mike"
 Student student2 = new Student("Mike"); 

 //input grades for Mary
 student1.inputGrades();
 //print average for Mary
System.out.print(student1.getAverage()); 
 System.out.println();

 //input grades for Mike
 student2.inputGrades(); 
 //print average for Mike
System.out.println(student2.getAverage()); 
System.out.println("Student 1 " + student1); 
    }
}
