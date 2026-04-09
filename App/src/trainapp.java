/**
 * trainapp
 *
 * UC6: Demonstrates mapping bogies to their seating/load capacity
 * using HashMap (key–value structure).
 *
 * @author YourName
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class trainapp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=====================================");
        System.out.println("   Train Consist Management App      ");
        System.out.println("=====================================");

        // Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);

        // Display bogie capacity details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nSystem successfully mapped bogies to their capacities.");
    }
}