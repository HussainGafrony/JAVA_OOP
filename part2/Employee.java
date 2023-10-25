package part2;

public class Employee extends Person {
    int Salary;
    String Rank;
    String Jop;

    public Employee(int salary, String rank, String jop, String n, int age, String add, String ny) {
        super(n, age, add, ny);
        Salary = salary;
        Rank = rank;
        Jop = jop;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public String getJop() {
        return Jop;
    }

    public void setJop(String jop) {
        Jop = jop;
    }

    @Override
    public void print_all_details() {
        super.print_all_details();
        System.out.println("Salary : " + Salary + "\n rank : " + Rank + "\n Jop : " + Jop);
    }

}
