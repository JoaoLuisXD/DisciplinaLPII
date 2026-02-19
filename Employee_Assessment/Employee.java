package Employee_Assessment;

public abstract class Employee {
    private String name;
    private String registration;
    private int workload;

    public Employee(String name, String registration, int workload){
        this.name = name;
        this.registration = registration;
        this.workload = workload;
    }

    public String getName() {
        return name;
    }
    public String getRegistration() {
        return registration;
    }
    public int getWorkload() {
        return workload;
    }

    public abstract double calculatePerformance() throws invalidDataException;

    public String getSummary(){
        return "name: " + name + "\nregistration: " + registration + "\nworkload: " + workload;
    }

}
