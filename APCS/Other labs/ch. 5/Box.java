public class Box implements Comparable {
    private double length, width, height;
    private static int nextId = 1000;
    private int boxId;
    
    public Box (double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        boxId = nextId;
        nextId++;
    }
    
    public double getVolume() {
        return length * width * height;
    }
    
    public String toString() {
        return "ID: " + boxId + "            Volume: " + this.getVolume();
    }
    
    public boolean equals(Object o) {
        Box s = (Box)o;
        return (Math.abs(this.getVolume()- s.getVolume()) < .001);
    }
    
    public int compareTo(Object o) {
        Box s = (Box)o;
        if (this.equals(s))
            return 0;
        else if (this.getVolume() > s.getVolume())
            return 1;
        else 
            return -1;
        }
        
    }