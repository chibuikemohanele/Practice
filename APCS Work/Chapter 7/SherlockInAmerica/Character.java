package SherlockInAmerica;
public abstract class Character extends NamedThing{
    private String characterName;
    private static int sherlockLife;
    private static int criminalLife;
    public Character(String n){
        super(n);
        characterName = n;   
        sherlockLife = 25;;
        criminalLife = 25;
    }

    public String getName(){
        return characterName;
    }

    public String toString(){
        return "This character's name is " + characterName;
    }

    public int getSherlockLife(){
        return sherlockLife;
    }

    public void setSherlockLife(int x){
        sherlockLife = x;
    }

    public int getCriminalLife(){
        return criminalLife;
    }

    public void setCriminalLife(int x){
        criminalLife = x;
    }
}
