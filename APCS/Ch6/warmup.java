public class warmup{
    public static void main(String[] args){
        String[] words = {"a", "b", "c", "d"};
        printArray(wordsFront(words,1));
        printArray(wordsFront(words,2));
        printArray(wordsFront(words,3));

        
        System.out.println("128 --> " + dividesSelf(128));
        System.out.println("113 --> " + dividesSelf(113));
        System.out.println("12 --> " + dividesSelf(12));

    }

    public static String[] wordsFront(String [] w, int n){
        String[] temp = new String[n];
        for (int i = 0; i < n; i++)
            temp[i] = w[i];
        return temp;
    }

    public static void printArray(String[] n){
        for (String w : n){
            if (w!=null){
                System.out.print("[" + w + "] ");	
            }

        }
        System.out.println();
    }

    public static boolean dividesSelf(int n){
        int remainder;
        int num = n;
        while(num > 0){
            remainder = n % 10;
            if (remainder == 0 || num % remainder != 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}