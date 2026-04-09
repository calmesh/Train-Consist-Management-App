/**
 * trainapp
 *
 * UC8: Demonstrates filtering passenger bogies using Java Stream API.
 * Filters bogies with capacity greater than 60.
 *
 * Author: YourName
 * Version: 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class (from UC7)
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class trainapp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Train Consist Management App      ");
        System.out.println("=====================================");

        // Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Display all bogies
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Filter bogies with capacity > 60 using Stream API
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        highCapacityBogies.forEach(System.out::println);

        System.out.println("\nOriginal list size: " + bogies.size());
        System.out.println("Filtered list size: " + highCapacityBogies.size());
        System.out.println("\nSystem successfully filtered bogies using Stream API.");
    }
}