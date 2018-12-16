package Colors;
public class Driver{
    public static void main(String[] args){
       System.out.println("\f");
        Color var1 = new Green();
        Red var2 = new Red();
        Color var3 = new Blue();
        Color var4 = new Red();
        Object var5 = new Blue();
        
        System.out.println("Testing the code now");
        /*
        System.out.print("var1.a: ");
        var1.a();
        System.out.println();
        //var1.b();
        //System.out.println();
        System.out.print("var1.c: ");
        var1.c();
        System.out.println();
        System.out.print("var2.a: ");
        var2.a();
        System.out.println();
        System.out.print("var2.b: ");
        var2.b();
        System.out.println();
        System.out.print("var2.c: ");
        var2.c();
        System.out.println();
        System.out.print("var3.a: ");
        var3.a();
        System.out.println();
        //var3.b();
        //System.out.println();
        */
        System.out.println("var3.c: ");
        var3.c();
        System.out.println();
        System.out.println("var4.a: ");
        var4.a();
        System.out.println();
        //System.out.print("var5.a: ");
        //var5.a();
        //System.out.println();
        System.out.println("((Blue)var5).a: ");
        ((Blue)var5).a();
        System.out.println();
        System.out.println("((Green)var1).a: ");
        ((Green)var1).a();
        System.out.println();
        System.out.println("((Green)var4).a: ");
        ((Green)var4).a();
        System.out.println();
        //System.out.print("((Green)var3).b: ");
        //((Green)var3).b();
       // System.out.println();
       // System.out.print("((Red)var3).b: ");
       // ((Red)var3).b();
        //System.out.println();
        System.out.println("((Red)var4).c: ");
        ((Red)var4).c();
        System.out.println();
        System.out.println("((Blue)var5).c: ");
        ((Blue)var5).c();
    }
}