package part2;

public class Salaried_Employee extends Employee {

    int Bonus;
    int Deductions;

    public Salaried_Employee(int salary, String rank, String jop, String n, int age, String add, String ny,
            int bonus, int deductions) {
        super(salary, rank, jop, n, age, add, ny);
        Bonus = bonus;
        Deductions = deductions;
    }

    @Override

    public int getSalary() {
        return Salary + Bonus - Deductions;

    }

    public void specialmethod() {
        System.out.println("special method");
    }

}
