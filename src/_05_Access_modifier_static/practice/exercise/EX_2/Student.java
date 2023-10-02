package _05_Access_modifier_static.practice.exercise.EX_2;

public class Student {
    private String name = "john";
    private String classes = "C02";
    public Student(){}
    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
