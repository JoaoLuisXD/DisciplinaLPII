package Employee_Assessment;

public class Professor extends Employee implements Assessable{
    int numberPublications;
    int classHours;

    public Professor(String name, String registration, int workload, int numberPublications, int classHours) throws invalidDataException{
        super(name, registration, workload);
        if(numberPublications < 0 || classHours <= 0){
            throw new invalidDataException("Negative values.");
        }
        if(classHours > getWorkload()){
            throw new invalidDataException("Class hours cannot exceed the total teaching hours.");
        }
        this.numberPublications = numberPublications;
        this.classHours = classHours;
    }

    public double calculatePerformance() throws invalidDataException{
        return classHours + numberPublications;
    }

    public double rate() throws invalidDataException{
        return calculatePerformance();
    }

    public String getSummary(){
        return super.getSummary() + "\nnumber of publications: " + numberPublications + "\nclass hours: " + classHours;
    }
}
