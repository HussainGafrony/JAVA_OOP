
package part3;

//  An enum is a specialized class

enum Gender {
    Male, Female
};

enum Course {
    Database, Programming, Math, ERP
};

enum Semester {
    Summer, Winter, Fall, Spring
};

public class RegisterForm {
    String stdname;
    Gender stGender;
    Course course;
    Semester semester;

    public RegisterForm(String stdname, Gender stGender, Course course, Semester semester) {
        this.stdname = stdname;
        this.stGender = stGender;
        this.course = course;
        this.semester = semester;
    }

}