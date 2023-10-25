package part2;

/**
 * Main
 */

public class Main {

    public static void main(String[] args) {

        // Student student = new Student("Ramy", 19, "lazyin", "Syria", 4, "IS", 3.9);

        // System.out.println("name : " + student.getName() + "\n" + "nationality : " +
        // student.getNationality());

        // use Override method in the class
        // Salaried_Employee salaried_Employee = new Salaried_Employee(600.50,
        // "Manager", "IS", "hussien", 25, "riyad",
        // "syria", 20, 150);
        // System.out.println(" Salary : " + salaried_Employee.getSalary());

        // Employee employee = new Employee(4000, "Teamleder", "IT", "Germ", 24,
        // "Kassel", "Japanes");
        // employee.print_all_details();

        // note :
        // ex1:
        // The second variable takes the type of the parent because it inherits from it,
        // but when we call a function from the child we cannot use it because the
        // variable is of the type of the parent. This means that we can only use the
        // function that is similar between them or change the type of the variable
        // Employee employee = new Employee(4000, "Teamleder", "IT", "Germ", 24,
        // "Kassel", "Japanes");
        // Employee employee2 = new Salaried_Employee(600, "Manager", "IS", "hussien",
        // 25, "riyad", "syria", 20, 150);
        // employee2.testdata();

        // ex2:
        // Employee employee = new Employee(4000, "Teamleder", "IT", "Germ", 24,
        // "Kassel", "Japanes");
        // Salaried_Employee employee2 = new Salaried_Employee(600, "Manager", "IS",
        // "hussien", 25, "riyad", "syria", 20,
        // 150);
        // employee2.specialmethod();

        // use protected type 
        // Rectangle rectangle = new Rectangle(1, 5);
        // System.out.println(rectangle.get_Area());

    }

}