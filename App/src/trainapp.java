
import java.util.HashSet;
import java.util.Set;

public class trainapp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=====================================");
        System.out.println("   Train Consist Management App      ");
        System.out.println("=====================================");

        // Create HashSet for bogie IDs (ensures uniqueness)
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Display unique bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nSystem ensures no duplicate bogie IDs.");
    }
}