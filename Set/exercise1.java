package Set;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class exercise1 {
    public static void main(String[] args) {
        Set<Integer> ClassA = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        int code = 0;
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Enter the student code: ");
                code = sc.nextInt();
                ClassA.add(code);
                if (code < 0) {
                    System.out.println("Negative numbers are not allowed");
                    sc.close();
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Only integers allowed");
                sc.close();
                return;
            }
        }

        Set<Integer> ClassB = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            try{
                System.out.println("Enter the student code: ");
                code = sc.nextInt();   
                ClassB.add(code);
                if (code < 0) {
                    System.out.println("Negative numbers are not allowed");
                    sc.close();
                    return;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input! Only integers allowed");
                sc.close();
                return;
            }
        }

        Set<Integer> aux = new HashSet<>(ClassA);
        aux.addAll(ClassB);

        System.out.println("students code \n---------------");
        for (Integer i : aux) {
            System.out.println(i);
        }

        sc.close();
    }
}
