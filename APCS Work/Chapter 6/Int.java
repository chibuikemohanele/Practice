import java.util.Scanner;
public class Int{
    public static void main(String[] args){
        System.out.println("\f");
        Scanner scan1 = new Scanner(System.in);
        int numArray;
        System.out.print("How many arrays do you want?: ");
        numArray = scan1.nextInt();
        int[] numbers = new int[numArray];
        for(int i = 0; i < numArray; i++){
            System.out.print("Integer #" + (i + 1) + ": ");
            numbers[i] = scan1.nextInt();
        }

        int min = numbers[0];
        int minLocation = 0;
        for (int i = 1; i < numArray; i++){
            if (numbers[i] < min){
                min = numbers[i];
                minLocation = i;
            }
        }

        System.out.println("\nThe smallest number you entered was # " + (minLocation + 1) + " with a value of "
            + min);
        printArray(numbers);
        System.out.println("\nGoodbye");
    }

    public static void printArray(int[] n){
        for (int i = 0; i < n.length; i++){
            System.out.print("[" + n[i] + "]");
        }

        System.out.println();
    }

    public static void reverseArray(int[] n){
        int t = n[0];
        for (int i = 0; i < n.length/ 2; i++){
            t = n[i];
            n[i] = n[n.length - 1 - i];
            n[n.length - 1] = t;
        }

    }

    
    }