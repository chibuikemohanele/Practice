package SherlockInAmerica;

/**
 * Riddle.java
 * Extends Game class and stores the riddles for Sherlock to solve.
 * @author Cameron and Chibui
 * @version 1.0
 */
import java.util.ArrayList;
public class Riddle extends NamedThing{
    private String answer;
    private String question;
    
    private ArrayList<String> riddleQuestion = new ArrayList<String> ();
    
    private ArrayList<String> riddleAnswer = new ArrayList<String> ();
    
    public Riddle (String n) {
        super(n);
        riddleQuestion.add(0, riddleQ1());
        riddleQuestion.add(1, riddleQ2());
        riddleQuestion.add(2, riddleQ3());
        riddleQuestion.add(3, riddleQ4());
        riddleQuestion.add(4, riddleQ5());
        riddleQuestion.add(5, riddleQ6());
        riddleQuestion.add(6, riddleQ7());
        riddleQuestion.add(7, riddleQ8());
        riddleQuestion.add(8, riddleQ9());
        riddleQuestion.add(9, riddleQ10());
        
        riddleAnswer.add(0, riddleA1());
        riddleAnswer.add(1, riddleA2());
        riddleAnswer.add(2, riddleA3());
        riddleAnswer.add(3, riddleA4());
        riddleAnswer.add(4, riddleA5());
        riddleAnswer.add(5, riddleA6());
        riddleAnswer.add(6, riddleA7());
        riddleAnswer.add(7, riddleA8());
        riddleAnswer.add(8, riddleA9());
        riddleAnswer.add(9, riddleA10());
    }
    
    public String riddleQ1 () {
        question = "What has a face and two hands but no arms or legs? A(n) _____";
        answer = "clock";
        return question;
    }
    public String riddleA1 () {
        question = "What has a face and two hands but no arms or legs? A(n) _____";
        answer = "clock";
        return answer;
    }
    
    public String riddleQ2 () {
        question = "What has a thumb and four fingers but is not alive? A(n) _____";
        answer = "glove";
        return question;
    }
    public String riddleA2 () {
        question = "What has a thumb and four fingers but is not alive? A(n) _____";
        answer = "glove";
        return answer;
    }
    
    public String riddleQ3 () {
        question = "What has to be broken before you can use it? A(n) _____";
        answer = "egg";
        return question;
    }
    public String riddleA3 () {
        question = "What has to be broken before you can use it? A(n) _____";
        answer = "egg";
        return answer;
    }
    
    public String riddleQ4 () {
        question = "What gets wetter as it dries? A(n) _____";
        answer = "towel";
        return question;
    }
    public String riddleA4 () {
        question = "What gets wetter as it dries? A(n) _____";
        answer = "towel";
        return answer;
    }
    
    public String riddleQ5 () {
        question = "What belongs to you but is used more by others? Your _____";
        answer = "name";
        return question;
    }
    public String riddleA5 () {
        question = "What belongs to you but is used more by others? Your _____";
        answer = "name";
        return answer;
    }
    
    public String riddleQ6 () {
        question = "Everyone has it and no one can lose it. A(n) _____";
        answer = "shadow";
        return question;
    }
    public String riddleA6 () {
        question = "Everyone has it and no one can lose it. A(n) _____";
        answer = "shadow";
        return answer;
    }
    
    public String riddleQ7 () {
        question = "What has a neck but no head? A(n) _____";
        answer = "bottle";
        return question;
    }
    public String riddleA7 () {
        question = "What has a neck but no head? A(n) _____";
        answer = "bottle";
        return answer;
    }
    
    public String riddleQ8 () {
        question = "Beth's mother has three daughters. One is Lara, the other is Sara. "
                    + "The name of the third is _____";
        answer = "Beth";
        return question;
    }
    public String riddleA8 () {
        question = "Beth's mother has three daughters. One is Lara, the other is Sara. "
                    + "The name of the third is _____";
        answer = "Beth";
        return answer;
    }
    
    public String riddleQ9 () {
        question = "What is full of holes but still holds water? A(n) _____";
        answer = "sponge";
        return question;
    }
    public String riddleA9 () {
        question = "What is full of holes but still holds water? A(n) _____";
        answer = "sponge";
        return answer;
    }
    
    public String riddleQ10 () {
        question = "What never asks questions but is often answered? A(n) _____";
        answer = "doorbell";
        return question;
    }
    public String riddleA10 () {
        question = "What never asks questions but is often answered? A(n) _____";
        answer = "doorbell";
        return answer;
    }
    
    private int currentNum = (int) (Math.random() * riddleQuestion.size());
    
    public String getRandomRiddleQuestion() {
        return riddleQuestion.get(currentNum);
    }
    
    public String getRandomRiddleAnswer()  {
        return riddleAnswer.get(currentNum);
    }
    
    public void removeRandomRiddle() {
        riddleQuestion.remove(currentNum);
        riddleAnswer.remove(currentNum);
    }
}
