public class TaskTest {
    public static void main(String[] args) {
        Task t1 = new Task("Eat");
        Task t2 = new Task("Finish APCS programs");
        Task t3 = new Task("Exercise");
        Task t4 = new Task("Watch TV");
        
        t1.setPriority(1);
        t2.setPriority(Priority.MIN_PRIORITY);
        t3.setPriority(7);
        t4.setPriority(Priority.MAX_PRIORITY);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        
        System.out.println();
        
        Task.comparePriorities(t1, t2);
        Task.comparePriorities(t1, t3);
        Task.comparePriorities(t1, t4);
    }
}
        