package SherlockInAmerica;
import java.util.Scanner;
public class Criminal extends Character{
    private String name;
    Scanner scan = new Scanner(System.in);
    public Criminal(String n){
        super(n);
        name = "Criminal";
    }

    public String getName(){
        return name;
    }

    public String toString(){
        String answer;
        return "This Character's name is " + name + ".";
    }

}