/*************
 * @author Chibuikem Ohanele
 * BandBooster.java
 * Does stuff
 * @version 1.0
 ***********/
public class BandBooster{
    private String name;
    private int boxesSold;
    public BandBooster(String n)
    {
        name = n;
        boxesSold = 0;
    }

    public String getName()
    {
        return name;
    }

    public void updateSales(int u)
    {
        boxesSold += u;
    }

    public String toString()
    {
        return name + " sold " + boxesSold + " boxes.";
    }

}
