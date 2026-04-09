
import java.util.LinkedHashSet;

public class trainapp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=====================================");
        System.out.println("   Train Consist Management App      ");
        System.out.println("=====================================");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // Duplicate - will be ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (No duplicates, insertion order preserved):");
        System.out.println(trainFormation);

        System.out.println("\nSystem ensures ordered and unique bogies.");
    }
}