// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
    public static void main(String[] args)
    {
        Labrador lab = new Labrador("Kitty", "brown");
        Yorkshire york = new Yorkshire("Yorky", "black");
        System.out.println();
        System.out.println(york.getName() + " says " + york.speak() + " and weighs " + york.avgBreedWeight());
        System.out.println(lab.getName() + " says " + lab.speak() + " and weighs " + lab.avgBreedWeight());
        
        
    }
}