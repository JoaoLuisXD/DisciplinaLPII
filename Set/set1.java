package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set1 {
    public static void main(String[] args) {
        Set<Integer> c1 = new LinkedHashSet<>();
        
        c1.add(1);
        c1.add(10);
        c1.add(5);
        c1.add(8);
        
        //c1.remove(8);
        //c1.removeIf(x->x>5);

        Set<Integer> c2 = new HashSet<>(Arrays.asList(1,5,20,30));

        Set<Integer> c3 = new HashSet<>(c1);

        //c3.addAll(c2); //unite the elements
        //c3.retainAll(c2); //intercession
        c3.removeAll(c2);

        System.out.println(c1.contains(5));

        for (Integer i : c1) {
            System.out.println(i);
        }

        System.out.println("---------");

        for (Integer i : c2) {
            System.out.println(i);
        }

        System.out.println("---------");

        for (Integer i : c3) {
            System.out.println(i);
        }


    }
}   
