package Employee_Assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emp = new ArrayList<>();
        int n = 0;
        String findRegistrantion;
        try {
            do {
                System.out.println("--------------------------");
                System.out.println("-----------MENU-----------");
                System.out.println("--------------------------");
                System.out.println("1 - add a professor");
                System.out.println("2 - add a server");
                System.out.println("3 - show the list");
                System.out.println("4 - to evaluate an employee's performance");
                System.out.println("0 - end the program");
                System.out.println("--------------------------");
                System.out.print("Enter a number: ");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        Employee emp1 = new Professor("Cici", "124", 8, 4, 5);
                        emp.add((Professor)emp1);
                        System.out.println("professor added successfully");
                        break;
                    case 2:
                        Employee emp2 = new Server("Flavio", "999", 4, "Cleaner", 8);
                        emp.add((Server)emp2);
                        System.out.println("server added successfully");
                        break;
                    case 3:
                        for (int i = 0; i < emp.size(); i++) {
                            if(emp.get(i) instanceof Professor){
                                System.out.println(emp.get(i).getSummary());
                            }
                            if(emp.get(i) instanceof Server) {
                                System.out.println(emp.get(i).getSummary());
                            }
                        }
                        break;
                    case 4:
                        System.out.print("Enter the registration number of the employee whose performance you want to view: ");
                        sc.nextLine();
                        findRegistrantion = sc.next();
                        for (int i = 0; i < emp.size(); i++) {
                            if(emp.get(i).getRegistration().equals(findRegistrantion)){
                                System.out.println(emp.get(i).calculatePerformance());
                            }
                        }
                        break;
                    case 0:
                        break;
                    default: System.out.println("invalid number!! Try another one");
                        break;
                }
            } while (n != 0);
        } catch (invalidDataException e) {
            System.out.println("erro: " + e.getMessage());
        }
               
        sc.close();
    }
}
