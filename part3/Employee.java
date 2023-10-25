package part3;

/**
 * Employee
 */
public abstract class Employee {

    String name;
    double age;
    double salary;
    String rank;
    String jop;

    public abstract double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }

}