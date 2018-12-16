package Colors;
public class Red extends Green{
    public void b(){
        System.out.println("Red b");
        super.c();
    }
    public void c(){
        System.out.println("Red c");
    }
}