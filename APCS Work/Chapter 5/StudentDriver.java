public class StudentDriver{
    public static void main(String[] args){
        Student student1 = new Student("Chibuikem", 120, 90.5, 88.7);
        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student1.getAverage());
        System.out.println(student1.toString());
        
        System.out.println();
        
        Student student2 = new Student("Stacy", 30, 4.4, 0);
        System.out.println(student2.getName());
        System.out.println(student2.getId());
        System.out.println(student2.getAverage());
        System.out.println(student2.toString());
        
        System.out.println();
        
        Student student3 = new Student("Joe", 70, 76.8, 80.6);
        System.out.println(student3.getName());
        System.out.println(student3.getId());
        System.out.println(student3.getAverage());
        System.out.println(student3.toString());
    
    }
}