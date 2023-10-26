package part4;

import java.util.ArrayList;

public class Department {
    int dno;
    String dname;
    ArrayList<Employee> empliList;

    public Department() {
    }

    public Department(int dno, String dname, ArrayList<Employee> empliList) {
        this.dno = dno;
        this.dname = dname;
        this.empliList = new ArrayList<Employee>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public ArrayList<Employee> getEmpliList() {
        return empliList;
    }

    public void setEmpliList(ArrayList<Employee> empliList) {
        this.empliList = empliList;
    }

    public void add_employee(Employee employee) {
        empliList.add(employee);
    }

    public void remove_employee(int idx) {
        empliList.remove(idx);
    }

    public int getEmployeeCount() {
        return empliList.size();
    }

    public void print_basic_data() {
        for (int i = 0; i < empliList.size(); i++) {
            System.out.println(empliList.get(i).getSsn() + " " + empliList.get(i).getName() + " "
                    + empliList.get(i).getAddress() + " " + empliList.get(i).getSex());
        }
    }

    public void print_all_details() {

        for (int i = 0; i < empliList.size(); i++) {

            if (empliList.get(i) instanceof SalariedEmployee)
                ((SalariedEmployee) empliList.get(i)).DisplayDetails();
            if (empliList.get(i) instanceof HourlyEmployee)
                ((HourlyEmployee) empliList.get(i)).DisplayDetails();
            if (empliList.get(i) instanceof CommissionEmployee)
                ((CommissionEmployee) empliList.get(i)).DisplayDetails();
        }

    }

}
