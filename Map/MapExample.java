package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Double> items = new HashMap<>();

        items.put("Book", 35.00);
        items.put("Magazine", 12.00);
        items.put("Newspaper", 5.00);

        for (Map.Entry<String, Double> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}