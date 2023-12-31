package part4;

public class CommissionEmployee extends Employee implements Displayable {

    public CommissionEmployee(String name, String address, int ssn, Gender sex, double gross_sales,
            double commission_rate) {
        super(name, address, ssn, sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }

    private double gross_sales;
    private double commission_rate;

    public double getGroos_sales() {
        return gross_sales;
    }

    public void setGroos_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }

    @Override
    public double earnings() {
        return gross_sales * commission_rate;
    }

    public void DisplayDetails() {
        System.out.println(super.toString());
        System.out.println(toString());

    }

    public void DisplayEarnings() {
        System.out.println(earnings());

    }

    @Override
    public String toString() {
        return "CommissionEmployee [groos_sales=" + gross_sales + ", commission_rate=" + commission_rate + "]";
    }

}
