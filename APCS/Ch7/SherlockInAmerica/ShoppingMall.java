package SherlockInAmerica;

/**
 * ShoppingMall.java
 * Extends Game class and provides the hints for each store.
 * @author Cameron and Chibui
 * @version 1.0
 */

import java.util.ArrayList;
public class ShoppingMall extends NamedThing {
    String name;
    String hint;
    
    ArrayList<String> mallQuestion = new ArrayList<String> ();
    
    ArrayList<String> mallAnswer = new ArrayList<String> ();
    
    public ShoppingMall (String n) {
        super(n);
        mallQuestion.add(0, mallQ1());
        mallQuestion.add(1, mallQ2());
        mallQuestion.add(2, mallQ3());
        mallQuestion.add(3, mallQ4());
        mallQuestion.add(4, mallQ5());
        mallQuestion.add(5, mallQ6());
        mallQuestion.add(6, mallQ7());
        mallQuestion.add(6, mallQ8());
        mallQuestion.add(8, mallQ9());
        mallQuestion.add(9, mallQ10());
        
        mallAnswer.add(0, mallA1());
        mallAnswer.add(1, mallA2());
        mallAnswer.add(2, mallA3());
        mallAnswer.add(3, mallA4());
        mallAnswer.add(4, mallA5());
        mallAnswer.add(5, mallA6());
        mallAnswer.add(6, mallA7());
        mallAnswer.add(7, mallA8());
        mallAnswer.add(8, mallA9());
        mallAnswer.add(9, mallA10());
    }
    
    public String mallQ1 () {
        name = "Apple";
        hint = "Think Different";
        return hint;
    }
    public String mallA1 () {
        name = "Apple";
        hint = "Think Different";
        return name;
    }
    
    public String mallQ2 () {
        name = "BMW";
        hint = "The Ultimate Driving Machine";
        return hint;
    }
    public String mallA2 () {
        name = "BMW";
        hint = "The Ultimate Driving Machine";
        return name;
    }
    
    public String mallQ3 () {
        name = "Nike";
        hint = "Just Do It";
        return hint;
    }
    public String mallA3 () {
        name = "Nike";
        hint = "Just Do It";
        return name;
    }
    
    public String mallQ4 () {
        name = "Calvin Klein";
        hint = "Between love and madness lies obsession";
        return hint;
    }
    public String mallA4 () {
        name = "Calvin Klein";
        hint = "Between love and madness lies obsession";
        return name;
    }
    
    public String mallQ5 () {
        name = "Target";
        hint = "Expect More. Pay Less.";
        return hint;
    }
    public String mallA5 () {
        name = "Target";
        hint = "Expect More. Pay Less.";
        return name;
    }
    
    public String mallQ6 () {
        name = "McDonald's";
        hint = "I'm Lovin' It (hint: include punctuation)";
        return hint;
    }
    public String mallA6 () {
        name = "McDonald's";
        hint = "I'm Lovin' It (hint: include punctuation)";
        return name;
    }
    
    public String mallQ7 () {
        name = "State Farm";
        hint = "Like a Good Neighbor, _____ is There";
        return hint;
    }
    public String mallA7 () {
        name = "State Farm";
        hint = "Like a Good Neighbor, _____ is There";
        return name;
    }
    
    public String mallQ8 () {
        name = "Walmart";
        hint = "Save Money. Live Better.";
        return hint;
    }
    public String mallA8 () {
        name = "Walmart";
        hint = "Save Money. Live Better.";
        return name;
    }
    
    public String mallQ9 () {
        name = "Adidas";
        hint = "Impossible is Nothing";
        return hint;
    }
    public String mallA9 () {
        name = "Adidas";
        hint = "Impossible is Nothing";
        return name;
    }
    
    public String mallQ10 () {
        name = "Nikon";
        hint = "At the heart of the image";
        return hint;
    }
    public String mallA10 () {
        name = "Nikon";
        hint = "At the heart of the image";
        return name;
    }
    
    private int currentNum = (int) (Math.random() * mallQuestion.size());
    
    public String getRandomMallQuestion() {
        return mallQuestion.get(currentNum);
    }
    
    public String getRandomMallAnswer() {
        return mallAnswer.get(currentNum);
    }
    
    public void removeRandomMall() {
        mallQuestion.remove(currentNum);
        mallAnswer.remove(currentNum);
    }
}