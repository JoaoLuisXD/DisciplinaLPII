package Map;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        addItem(inventory, "rice", 5);
        addItem(inventory, "meat", 10);

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void addItem(Map<String, Integer> inventory, String product, Integer quantity) {
        inventory.put(product, quantity);
    }

    public static void removeItem(Map<String, Integer> inventory, String product, Integer quantity) {
        Integer currentQuantity = inventory.get(product);
        inventory.put(product, currentQuantity - quantity);
    }
}