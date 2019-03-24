public class Task implements Comparable, Priority {
    private int priorityNum;
    private String priorityName;
    
    public Task(String name) {
        priorityName = name;
    }
    
    public String getName() {
        return priorityName;
    }
    
    public void setPriority(int x) {
        priorityNum = x;
    }
    
    public int getPriority() {
        return priorityNum;
    }
    
    public int compareTo(Object other) {
        Task t = (Task)other;
        
        if (this.getPriority() == t.getPriority())
            return 1;
        else if (this.getPriority() > t.getPriority())
            return 0;
        else 
            return -1;
        }
        
    public static void comparePriorities(Task t1, Task t2) {
        if (t1.compareTo(t2) == 1)
             System.out.println("\n" + t1.getName() + " has an equal priority to " +
                                t2.getName());
        else if (t1.compareTo(t2) == 0)
            System.out.println("\n" + t1.getName() + " has a greater priority than " +
                                t2.getName());
        else
            System.out.println("\n" + t1.getName() + " has a lower priority than " +
                                t2.getName());
        
                            }
  
    public String toString() {
        return priorityName + " has a priority of " + priorityNum;
    }
}
    