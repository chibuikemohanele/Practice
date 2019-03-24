// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//
// ****************************************************************
public abstract class Dog
{
    private String name;
    private String color;
    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name, String color)
    {
        this.name = name;
        this.color = color;
    }
    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName()
    {
        return name;
    }
    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }
    
    public abstract int avgBreedWeight();
}