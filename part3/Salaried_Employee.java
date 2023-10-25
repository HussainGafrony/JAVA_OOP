package part3;

public class Salaried_Employee extends Employee {
    double bouns;
    double deduction;

    @Override

    public double getSalary() {

        return salary + bouns - deduction;
    }
}
