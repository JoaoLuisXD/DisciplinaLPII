package Compare;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student a  = new Student("Maria",1);
        Student b = new Student("Joao", 2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);

        Collections.sort(students);
        for (Student i : students) {
            System.out.println(i.toString());
        }

        String s1 = new String("Maria");
        String s2 = new String("Maria");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));

        System.out.println(s1==s2);
    }
}
