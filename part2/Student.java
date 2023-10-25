package part2;

public class Student extends Person {
    int study_level;
    String specialization;
    Double GPA;

    public Student(String name, int age, String address, String nationality, int lvl, String sp, Double gpa) {
        super(name, age, address, nationality);
        study_level = lvl;
        specialization = sp;
        GPA = gpa;
    }

    public int getStudy_level() {
        return study_level;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double gPA) {
        GPA = gPA;
    }

}
