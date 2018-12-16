/**
 * TaskTest.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Tests the task stuff I created.
 */
public class TaskTest{
    public static void main (String []args){
        Task t1 = new Task("\"Eating\"");
        Task t2 = new Task("\"Chores\"");
        Task t3 = new Task("\"School\"");
        Task t4 = new Task("\"Sports\"");
        t1.setPriority(2);
        t2.setPriority(1);
        t3.setPriority(10);
        t4.setPriority(2);
        System.out.println(comparePriorities(t1,t2));
        System.out.println(comparePriorities(t1,t3));
        System.out.println(comparePriorities(t1,t4));
    }

    public static String comparePriorities(Task x, Task y){
        if(x.compareTo(y) == 1){
            return x.getTaskName() + " has a higher priority than " + y.getTaskName() + ".";
        }
        else 
        if(x.compareTo(y) == -1){
            return x.getTaskName() + " has a lower priority than " + y.getTaskName() + ".";
        }
        else {
            return x.getTaskName() + " has an equal priority to " + y.getTaskName() + ".";
        }
        
    }
}