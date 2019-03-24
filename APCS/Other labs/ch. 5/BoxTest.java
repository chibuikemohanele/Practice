import java.util.Arrays;
public class BoxTest {
    public static void main(String[] args) {
        Box[] boxes = new Box[4];
        boxes[0] = new Box(10, 10, 3);
        boxes[1] = new Box(1, 1, 1);
        boxes[2] = new Box(5, 5, 5);
        boxes[3] = new Box(4, 4, 4);
        
        System.out.println("\f");
        for (Box b: boxes)
            System.out.println(b);
            
        System.out.println("*** after sort");
        Arrays.sort(boxes);
        
        for (Box b: boxes)
            System.out.println(b);
            
        }
        
    }