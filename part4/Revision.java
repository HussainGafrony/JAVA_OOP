package part4;

public class Revision {
    public static void main(String[] args) {

        Department department = new Department(1, "System Information ", null);

        SalariedEmployee sEmployee = new SalariedEmployee("Ahmed", "Oman", 15, Gender.male, 1800, 150, 2);
        department.add_employee(sEmployee);

        HourlyEmployee hEmployee = new HourlyEmployee("ranya", "maly", 12, Gender.female, 5, 15);
        department.add_employee(hEmployee);

        CommissionEmployee cEmployee = new CommissionEmployee("ali", "Lobnan", 9, Gender.male, 450, 1.8);
        department.add_employee(cEmployee);


        // System.out.println(department.getEmployeeCount());

        // department.print_basic_data();
        department.print_all_details();
    }
}
