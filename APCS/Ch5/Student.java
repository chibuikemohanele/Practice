public class Student{
    private String name;
    private int studentID;
    private static int idCount = 1000;
    private double test1, test2, test3;
    public Student(String studentName, double testOne, double testTwo, double testThree){
        name = studentName;
        test1 = testOne;
        test2 = testTwo;
        test3 = testThree;
        studentID = idCount;
        idCount++;
    }
    public int getId(){
        return studentID;
    }
    public String getName(){
        return name;
    }
    public double getAverage(){
        double testAverage;
        testAverage = ((test1 + test2 + test3)/ 3);
        return testAverage;
    }
    public String toString(){
        return "Name: " + name + "\nStudent ID: " + studentID + "\nTest 1: " + test1 + "\nTest 2: " + test2 + "\nTest 3: " + test3
                + "\nTest Average: " + getAverage();
    }
}