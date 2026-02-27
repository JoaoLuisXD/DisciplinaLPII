package Compare;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private Integer registration;

    Student(String name, Integer registration){
        this.name = name;
        this.registration = registration;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getRegistration() {
        return registration;
    }
    public void setCode(Integer registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nRegistration: " + registration;
    }

    public int compareTo(Student o) {
        return -registration.compareTo(o.getRegistration());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(registration, student.registration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registration);
    }

}
