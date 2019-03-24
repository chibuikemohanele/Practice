// ****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// ****************************************************************
public class Yorkshire extends Dog
{
    private int breedWeight = 12;
    public Yorkshire(String name, String color)
    {
        super(name, color);
    }
    // ------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak()
    {
        return "yap yap";
    }
    
     public int avgBreedWeight()
    {
        return breedWeight;
    }
}