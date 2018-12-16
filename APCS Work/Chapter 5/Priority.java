/**
 * Priority.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Prioritizes things in order from 1-10
 */
public interface Priority{
    int MIN_PRIORITY = 1;
    int MED_PRIORITY = 5;
    int MAX_PRIORITY = 10;

    public void setPriority(int x);

    public int getPriority();
}