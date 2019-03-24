package Employee;


public class Comission extends Hourly {
    private double totalSales;
    private double comishRate;
    
    public Comission (String eName, String eAddress, String ePhone, String socSecNumber,
    double rate, double c) {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        comishRate = c;
    }
    
    public void addSales (double tSales) {
        totalSales += tSales;
    }
    
    public double pay() {
        double payment = super.pay() + totalSales * comishRate;
        totalSales = 0;
        return payment;
    }
}
                      