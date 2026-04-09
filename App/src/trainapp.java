
import java.util.ArrayList;
import java.util.List;

public class trainapp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=====================================");
        System.out.println("   Train Consist Management App      ");
        System.out.println("=====================================");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after addition
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nIs 'Sleeper' bogie present? " + exists);

        // Final state
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready for next operations...");
    }
}