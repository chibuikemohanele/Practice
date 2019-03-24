/***********
 * @author Chibuikem Ohanele
 * Name.java
 * Does stuff with names for names
 * @version 1.0
 **********/
public class Name{
    private String first;
    private String middle;
    private String last;
    private String othername;
    private int totalchars;
    public Name (String f, String m, String l){
        first = f;
        middle = m;
        last = l;
    }

    public String getFirst(){
        return first;
    }

    public String getMiddle(){
        return middle;
    }

    public String getLast(){
        return last;
    }

    public String firstMiddleLast(){
        return first + " " + middle + " " + last;
    }

    public String lastFirstMiddle(){
        return last + ", " + first + " " + middle;
    }

    public boolean equals (Name othername){
        return firstMiddleLast().equalsIgnoreCase(othername.firstMiddleLast());
    }
    
    public String initials(){
        return first.substring(0,1).toUpperCase() + middle.substring(0,1).toUpperCase() + last.substring(0,1).toUpperCase();
    }
    
    public int length(){
        totalchars = (first.length() + middle.length() + last.length());
        return totalchars;
    }
}