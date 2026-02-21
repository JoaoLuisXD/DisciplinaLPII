package Compare;
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

}
