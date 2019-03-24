package SherlockInAmerica;
import java.util.Scanner;
public class Sherlock extends Character{
    private String name;
    private String answer;
    public Sherlock(String n){
        super(n);
        name = "Sherlock";
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "This Character's name is " + name;
    }

    public int fight(){
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "U";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number for computer play
        int counter = 0;
        int counter2 = 0;
        System.out.println("Sherlock meets the Criminal and must fight him until he dies "
            + "\nor until the Criminal kills Sherlock. In order to defeat "
            + " \nthe criminal Sherlock can either punch him, shoot him, or "
            + " \nknife him. Please proceed to fight the criminal. Good Luck!");

        Scanner scan = new Scanner(System.in);
        while (counter < 1){        
            System.out.print ("What do you want to play? Punch (P), Gun (G), or Knife (K): ");
            personPlay = scan.nextLine();
            personPlay = personPlay.toUpperCase();
            int x;

            computerInt = (int)(Math.random() * 3);
            //Translate computer's randomly generated play to string
            if (personPlay.substring(0,1).equalsIgnoreCase("P")||personPlay.substring(0,1).equalsIgnoreCase("G")||personPlay.substring(0,1).equalsIgnoreCase("K")){
                if (computerInt == 0){
                    computerPlay = "K";}

                else if (computerInt == 1){
                    computerPlay = "P";}

                else if (computerInt == 2){
                    computerPlay = "G";}}
            if (!computerPlay.equals("U")){
                System.out.println ("The computer's play is: " + computerPlay);}
            else System.out.println ("Input is invalid.\n");

            //See who won.  Use nested ifs instead of &&.
            if (personPlay.equals(computerPlay)){
                System.out.println("It's a tie!");
                System.out.println("Both the Criminal and Sherlock's are depleted by 5.\n");
                x = getCriminalLife() - 5;
                setCriminalLife(x);
                x = getSherlockLife() - 5;
                setSherlockLife(x);
                System.out.println("Sherlock's life is " + getSherlockLife());
                System.out.println("The Criminal's life is " + getCriminalLife() + "\n");
            }
            if (personPlay.equals("P")){
                if (computerPlay.equals("K")){
                    System.out.println("Punch is stronger than knife.  You win!!"
                        + " The Criminal's life is depleted by 5.\n");
                    x = getCriminalLife() - 5;
                    setCriminalLife(x);
                    System.out.println("Sherlock's life is " + getSherlockLife());
                    System.out.println("The Criminal's life is " +getCriminalLife() + "\n");
                }
            }
            if (personPlay.equals ("P")){
                if (computerPlay.equals("G")){
                    System.out.println("Punch loses to gun. You lose!"
                        + " Sherlock's life is depleted by 5.\n");
                    x = getSherlockLife() - 5;
                    setSherlockLife(x);
                    System.out.println("Sherlock's life is " + getSherlockLife());
                    System.out.println("The Criminal's life is " +getCriminalLife() + "\n");
                }
            }
            if (personPlay.equals("G")){
                if (computerPlay.equals("P")){
                    System.out.println("Gun beats punch. You Win!!"
                        + " The Criminal's life is depleted by 5.\n");
                    x = getCriminalLife() - 5;
                    setCriminalLife(x);
                    System.out.println("Sherlock's life is " + getSherlockLife());
                    System.out.println("The Criminal's life is " +getCriminalLife() + "\n");
                }
            }
            if (personPlay.equals ("G")){
                if (computerPlay.equals("K")){
                    System.out.println("Gun loses to knife. You lose!!"
                        + " Sherlock's life is depleted by 5.\n");
                    x = getSherlockLife() - 5;
                    setSherlockLife(x);
                    System.out.println("Sherlock's life is " + getSherlockLife());
                    System.out.println("The Criminal's life is " +getCriminalLife() + "\n");
                }
            }
            if (personPlay.equals("K")){
                if (computerPlay.equals("G")){
                    System.out.println ("Knife beats gun. You Win!!"
                        + " The Criminal's life is depleted by 5.\n");
                    x = getCriminalLife() - 5;
                    setCriminalLife(x);
                    System.out.println("Sherlock's life is " + getSherlockLife());
                    System.out.println("The Criminal's life is " +getCriminalLife() + "\n");
                }
            }
            if (personPlay.equals ("K")){
                if (computerPlay.equals("P")){
                    System.out.println ("Knife is weaker than punch. You lose."
                        + " Sherlock's life is depleted by 5.\n");
                    x = getSherlockLife() - 5;
                    setSherlockLife(x);
                    System.out.println("Sherlock's life is " + getSherlockLife());
                    System.out.println("The Criminal's life is " +getCriminalLife() + "\n");
                }
            }
            
            if((getSherlockLife() == 0) && (getCriminalLife() == 0)){
                setCriminalLife(25);
                setSherlockLife(25);
                System.out.println("Both Sherlock and the Criminal ran out of life." +
                                    "\n Restart.");
            }
            if(getSherlockLife() == 0){
                System.out.println("Sherlock has been beaten up. While he recovers, the criminal escapes again.\n");
                counter++;
                return 1;
            }
            else if (getCriminalLife() == 0){
                System.out.println("You beat the Criminal and have captured him. Great job!\n");
                counter++;
                return -1;
            }

        }
        return 0;
    }
}