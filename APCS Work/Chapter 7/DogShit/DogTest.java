package DogShit;

/**
 * @Author Chibuikem Ohanele
 * DogTest.java
 * A simple test class that creates a Dog and makes it speak.
 */
public class DogTest{
    public static void main(String[] args)
    {
        Dog yorkshire = new Yorkshire("Yorky");
        Dog labrador = new Labrador("Labby", "black");
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
        System.out.println();
        System.out.println(labrador.getName() + " says " + labrador.speak());

    }
}