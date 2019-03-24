import java.util.*;
import java.io.*;
public class TreasureHunt {
    
    public static void main (String[] args) throws IOException {
       // open text file and read in data
       Scanner file = new Scanner(new File("TreasureHunt.txt"));
       
       // first two ints are row,col for grid.  Create grid object.
       int gridRow = file.nextInt();
       int gridCol = file.nextInt();
       Grid grid = new Grid(gridRow, gridCol);
       file.nextLine();
       // read list of places and add to an arraylist
       ArrayList<String> places = new ArrayList<String>();
       for (int i = 0; i < gridRow*gridCol - 2; i ++)
           places.add(file.nextLine());
       
       // pass the array of place objects to grid to create kingdom
       grid.createKingdom(places);
       

      // read list of treasure items, create treasure object and add to grid 
      int numTreasures = file.nextInt();
       for (int i = 0; i < numTreasures; i++)
          grid.addItemToPlace(new Treasure(file.next(), file.nextInt()));
      // read list of weapons, create weapon objects and add to grid  
       int numWeapons = file.nextInt();
       for (int i = 0; i < numWeapons; i++)
          grid.addItemToPlace(new Weapon(file.next(), file.nextInt()));
      // read list of foes, create foe objects and add to grid   
       int numFoes = file.nextInt();
       for (int i = 0; i < numFoes; i++)
          grid.addFoeToPlace(new Foe(file.next(), file.nextInt()));
          
       //System.out.println(grid);
       // create princess object, main character
       Princess fiona = new Princess("Fiona", grid);
       
       boolean done = false;
       System.out.print("********* Treasure Hunt ************\n");
       System.out.print("*  Welcome!  Type 'help' to begin. *\n");
       System.out.println("************************************\n");
       Scanner scan = new Scanner(System.in);   
       // play game until done
       while (!done) {
           
           done = promptUser(scan,fiona);
           
           
           
        }     
        
    }
    
    public static boolean promptUser(Scanner scan, Princess p) {
        System.out.print ("Enter command: ");
        String input = scan.next();
        switch (input) {
            case "help":  System.out.println("'help' 'move' 'battle' 'view' 'pickup' 'status' 'quit'");
                     break;
            case "move":  p.move(scan.next().substring(0,1));
                     break;
            case "battle":  p.battle();
                     break;
            case "view":  p.view();
                     break;
            case "pickup": p.pickup(scan.next());
                     break;
            case "status": p.status();
                     break;
            case "quit": return true;
                    
            default: System.out.println ("Invalid choice.");                         
                     break;
        }
        return false;
    }
}
