import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Bogie class
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
        bogies.add(new Bogie("Sleeper", 72)); // duplicate name to show grouping
        bogies.add(new Bogie("AC Chair", 54));

        // Display all bogies
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Group bogies by name using Stream API
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped bogies
        System.out.println("\nGrouped Bogies (by Type):");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });

        System.out.println("\nSystem successfully grouped bogies by type.");
    }
}