public class Driver{
    public static void main (String []args){
        Card a = new Card();
        Card b = new Card();
        System.out.println("Same suit?: " + a.sameSuit(a, b));
        System.out.println("Compare to: " + a.compareTo(b));
        
        
    }
    
}