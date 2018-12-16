package Employee;
/**
 * @Author Chibuikem Ohanele
 * Comission.java
 * Pays people
 */
public class Commission extends Hourly{
    private double totalSales;
    private double comRate;
    public Commission(String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        comRate = commissionRate;
    }
    
    public void addSales (double tSales){
        totalSales += tSales;
    }
    
    public double pay(){
        double x = (super.pay() + (totalSales *comRate));
        totalSales = 0;
        return x;
    }
}