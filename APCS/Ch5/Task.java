/**
 * Task.java
 * @Chibuikem Ohanele
 * @verison 1.0
 * Does stuff idk.
 */
public class Task implements Comparable, Priority {
    private int priority;
    private String taskName;
    public Task(String name){
        taskName = name;
    }
    
    public String getTaskName(){
        return taskName;
    }
    
    public void setPriority(int x){
        priority = x;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public String toString(){
        return "The priority of " + taskName + " is " + priority + ".";
    }
    
    public int compareTo (Object o){
        Task t1 = (Task) o;
        if (this.getPriority() < t1.getPriority()){
            return -1;
        }
        else 
        if (this.getPriority() > t1.getPriority()){
            return 1;
        }
        return 0;
    }
}