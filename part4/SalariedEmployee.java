package part4;

public class SalariedEmployee extends Employee implements Displayable {

    double salary, bonus, deductions;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String address, int ssn, Gender sex, double salary, double bonus,
            double deductions) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    @Override
    public double earnings() {
        return (salary + bonus) - deductions;
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
        return "SalariedEmployee [salary=" + salary + ", bonus=" + bonus + ", deductions=" + deductions + "]";
    }

}
