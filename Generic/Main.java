package Generic;

public class Main {
    public static void main(String[] args) {
        PrintCollection<Integer> pc = new PrintCollection<>();
        pc.addValue(5);
        pc.addValue(2);

        System.out.println("first: " + pc.first());

        pc.printList();

        PrintCollection<String> pc2 = new PrintCollection<>();
        pc2.addValue("Joao");

        pc2.printList();
    }
}
