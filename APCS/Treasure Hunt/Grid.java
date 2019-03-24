import java.util.*;
public class Grid {
    
    private Place[][] kingdom;
    
    public Grid(int r, int c) {
        kingdom = new Place[r][c];
    }
    
    public void createKingdom(ArrayList<String> p) {
        int i = 0;
        for (int r = 0; r < kingdom.length; r++)
           for (int c = 0; c < kingdom[r].length; c++){
               if (r == 0 && c == 0)
                  kingdom[0][0] = new Place("Start");
               else if (r == kingdom.length - 1 && c == kingdom[r].length - 1)
                  kingdom[kingdom.length - 1][kingdom[r].length - 1] = new Place("EXIT");
               else {
                  kingdom[r][c] = new Place(p.get(i));
                  i++;
                }
            }
    }
    
    public void addItemToPlace(Item i) {
        int row = (int)(Math.random() * kingdom.length);
        int col = (int)(Math.random() * kingdom[0].length);
        kingdom[row][col].addItem(i);

    }
    
    public void addFoeToPlace(Foe f) {
        int row = (int)(Math.random() * kingdom.length);
        int col = (int)(Math.random() * kingdom[0].length);
        kingdom[row][col].addFoe(f);
    }
    
    public void listPlace(int r, int c) {
        System.out.println (kingdom[r][c]);
    }
    
    public boolean isValid(int r, int c) {
        return (r >= 0 && r < kingdom.length && c >=0 && c < kingdom[0].length);
    }
    
    public boolean placeContains(int r, int c, String i) {
        return kingdom[r][c].contains(i);
    }
    
    public boolean canBattle(int r, int c) {
       return kingdom[r][c].numFoes() > 0;
    }
    
    public int getFoeBattleNum(int r, int c) {
        return kingdom[r][c].getFoeBattleNum();
    }
     
    public void removeFoe(int r, int c) {
        kingdom[r][c].removeFoe();
    }
    
    public Item getItem(int r, int c, String i){
       return kingdom[r][c].removeItem(i); 
    }
    
    public String toString() {
        String temp = "";
        for (Place[] row : kingdom)
           for (Place p : row)
              temp += p + "\n";
        return temp;
    }
           
}
