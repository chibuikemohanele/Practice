public class Displacement{
    public static void main (String[] args){
        double ss = 12.0;
        double vv = 3.5;
        double a = 9.8;
        int t = 10;
        double s = ss + (vv * t) + (a * (t * t)) / 2;
        System.out.println ("s: " + s);

    }
}