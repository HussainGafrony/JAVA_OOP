package part4;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    public BasePlusCommissionEmployee(String name, String address, int ssn, Gender sex, double gross_sales,
            double commission_rate) {
        super(name, address, ssn, sex, gross_sales, commission_rate);

    }

    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double earnings() {
        return base + super.earnings();
    }

    public void DisplayDetails() {
        super.DisplayDetails();
        DisplayEarnings();
    }

    public void DisplayEarnings() {
        System.out.println("Earnings = " + earnings());
    }

}
