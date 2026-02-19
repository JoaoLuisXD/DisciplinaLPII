package Employee_Assessment;

public class Server extends Employee implements Assessable{
    private String sector;
    private double managementRate;

    public Server(String name, String registration, int workload, String sector, double managementRate) throws invalidDataException{
        super(name, registration, workload);
        if (managementRate < 0) {
            throw new invalidDataException("Negative values.");
        }
        this.sector = sector;
        this.managementRate = managementRate;
    }

    public double calculatePerformance() throws invalidDataException{
        return managementRate;
    }

    public double rate() throws invalidDataException{
        return calculatePerformance();
    }

    public String getSummary(){
        return super.getSummary() + "\nsector: " + sector + "\nmanagement rate: " + managementRate;
    }
}
