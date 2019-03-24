public interface Priority {
    
    public static final int MIN_PRIORITY = 1;
    public static final int MED_PRIORITY = 5;
    public static final int MAX_PRIORITY = 10;
    
    
    public void setPriority(int x);
    
    public int getPriority();
}