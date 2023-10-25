package part2;

public class Person {
    String name;
    int age;
    String address;
    String nationality;

    public Person(String name, int age, String address, String nationality) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void print_all_details() {
        System.out.println("Name : " + name + "\n Age : " + age + "\n Nationality : " + nationality
                + "\n Address : " + address);
    }

}
