/****************************************************************
 * @author Chibuikem Ohanele
 * Student.java
 * Define a student class that stores name, score on test 1, and score on test 2.  Methods prompt for and read in grades, compute the average, and return a string containing student’s info. 
 * @version 1.0
 ****************************************************************/
import java.util.Scanner;
public class Student
{
    private String name;
    private int test1;
    private int test2; //declare instance data 
    Scanner scan1 = new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String s)
    {
        name = s;//add body of constructor
    }

    public String getName()
    {
        return name;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("What is the grade for " + name + "'s first test?");
        test1 = scan1.nextInt();
        System.out.println("What is the grade for " + name + "'s second test?");
        test2 = scan1.nextInt();;//add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    public double getAverage()
    {
        double average = ((test1 + test2) / 2.0); //add body of getAverage
        return average;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    public String printName(String s)
    {
        name = s;
        return name;//add body of printName
    }

    public String toString()
    {
        return "Name: " + name +  " test1: " + test1 + " test2: " + test2;
    }
}
