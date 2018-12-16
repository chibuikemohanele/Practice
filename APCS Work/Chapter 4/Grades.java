/******************
 * @author Chibuikem Ohanele
 * Grades.java
 * Use Student class to get test grades for two students and compute averages 
 * @version 1.0
 ***********************************************************/
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student ("Mike");//create student2, "Mike"

        student1.inputGrades();//input grades for Mary
        System.out.println(student1.toString());
        System.out.println("The average for Mary is: " + student1.getAverage());//print average for Mary

        System.out.println();

        student2.inputGrades();//input grades for Mike
        System.out.println(student2.toString());
        System.out.println("The average for Mike is: " + student2.getAverage());//print average for Mike

    }
}
