/********
 * @author Chibuikem Ohanele
 * @version 1.0
 *******/
import java.util.ArrayList;
public class warmup1{
    public static void main (String[] args){
        System.out.println("\f");
        ArrayList <Integer> scores = new ArrayList <Integer>();
        scores.add(63);
        scores.add(99);
        scores.add(83);
        scores.add(63);
        scores.add(89);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;
        for (int i = 0; i < scores.size(); i++){
            System.out.print("[" + scores.get(i) + "]");
        }   

        for (int i = 0; i < scores.size(); i++){
            if (scores.get(i) > max)
                max = scores.get(i);
            if (scores.get(i) < min)
                min = scores.get(i);
        }  
        System.out.println();
        for (int i = 0; i < scores.size(); i++){
            if(scores.get(i)==max || scores.get(i)==min){
                scores.remove(i);
            }
            else 
                i++;

        }

        for (int i = 0; i < scores.size(); i++){
            total += scores.get(i);
        }
        double average = total/scores.size();
        System.out.println();
        System.out.println("Max: " + max + " " + "Min: " + min);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        int[] numsyes = {2,3,4,5,5};
        int[] numsno = {2,3,4,5,6,};
        System.out.println(hasDuplicates(numsyes));
        System.out.println(hasDuplicates(numsno));
    }  

    public static boolean hasDuplicates(int[] num){
        for (int i = 0; i < num.length -1; i++){
            if (num[i-1] == num[i])
                return true;
        }
        return false;
    }
}