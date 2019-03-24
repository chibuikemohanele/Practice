public class FlipCoin {
    public static void main (String[] args){
        Coins1 myCoin = new Coins1();

        for (int i = 1; i < 10; i++){
            myCoin.flip();
            System.out.println(myCoin.toString());

        }
    }
}
