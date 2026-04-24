// FILE: TrainConsistManagementApp.java
// Train Consist Management App - Base Setup

import java.util.*;

// ============================================================
// UC1: Initialize Train and Display Consist Summary
// Concepts: Class, main(), static, ArrayList, List Interface,
//           Console Output, Dynamic Initialization
// ============================================================
class UseCase1TrainConsistApp {
    public static void main(String[] args) {
        // Print welcome message
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("=================================");

        // Initialize an empty List using ArrayList
        // ArrayList is dynamic — size grows as bogies are added
        List<String> consist = new ArrayList<>();

        // Display initial bogie count using size()
        System.out.println("Train initialized.");
        System.out.println("Initial Bogie Count: " + consist.size());
        System.out.println("System ready for bogie attachment.");
    }
}
// ============================================================
// UC2: Add Passenger Bogies to Train
// Concepts: ArrayList, add(), size(), List iteration,
//           Dynamic collection growth
// ============================================================
class UseCase2TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC2: Add Passenger Bogies     ");
        System.out.println("=================================");

        // Initialize the train consist as a dynamic list
        List<String> consist = new ArrayList<>();

        // Add passenger bogies dynamically
        consist.add("Engine");
        consist.add("Sleeper-B1");
        consist.add("Sleeper-B2");
        consist.add("AC-Chair-C1");
        consist.add("First-Class-F1");
        consist.add("Guard-Van");

        // Display all bogies in the consist
        System.out.println("\nBogies added to train:");
        for (String bogie : consist) {
            System.out.println("  -> " + bogie);
        }

        // Display total count
        System.out.println("\nTotal Bogies in Consist: " + consist.size());
    }
}
// ============================================================
// UC3: Track Unique Bogie IDs (HashSet)
// Concepts: HashSet, Set Interface, add(), Automatic
//           Deduplication, Unordered Storage
// ============================================================
class UseCase3TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC3: Unique Bogie IDs (HashSet)");
        System.out.println("=================================");

        // HashSet stores only unique elements — no duplicates allowed
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        bogieIds.add("B001");
        bogieIds.add("B002");
        bogieIds.add("B003");
        bogieIds.add("B001"); // Duplicate — will be ignored automatically
        bogieIds.add("B004");
        bogieIds.add("B002"); // Duplicate — will be ignored automatically

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println("  -> " + id);
        }

        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
        System.out.println("(Duplicates were automatically rejected by HashSet)");
    }
}
// ============================================================
// UC4: Maintain Bogie Order Using LinkedList
// Concepts: LinkedList, Deque operations, addFirst(),
//           addLast(), peek(), Dynamic ordering
// ============================================================
class UseCase4TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC4: Bogie Order (LinkedList) ");
        System.out.println("=================================");

        // LinkedList maintains insertion order and allows
        // adding elements at both front and rear
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies to rear (normal attachment)
        consist.addLast("Sleeper-B1");
        consist.addLast("Sleeper-B2");
        consist.addLast("AC-Chair-C1");

        // Add engine to front (priority attachment)
        consist.addFirst("Engine");

        // Add guard van to rear (end of train)
        consist.addLast("Guard-Van");

        // Display consist in order
        System.out.println("\nTrain Consist (Front to Rear):");
        for (String bogie : consist) {
            System.out.println("  -> " + bogie);
        }

        System.out.println("\nFirst bogie (Front): " + consist.peekFirst());
        System.out.println("Last bogie  (Rear) : " + consist.peekLast());
        System.out.println("Total Bogies       : " + consist.size());
    }
}
// ============================================================
// UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
// Concepts: LinkedHashSet, Set Interface, add(),
//           Automatic Deduplication, Insertion Order Preservation
// ============================================================
class UseCase5TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC5: Ordered Unique Bogies    ");
        System.out.println("=================================");

        // LinkedHashSet = uniqueness (like HashSet) +
        //                 insertion order (like List)
        Set<String> formation = new LinkedHashSet<>();

        // Attach bogies in order
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Attempt to attach duplicate — will be silently ignored
        formation.add("Sleeper"); // Duplicate ignored

        // Display formation in insertion order
        System.out.println("\nTrain Formation (Insertion Order):");
        for (String bogie : formation) {
            System.out.println("  -> " + bogie);
        }

        System.out.println("\nTotal Bogies (no duplicates): " + formation.size());
        System.out.println("(LinkedHashSet preserved order AND rejected duplicates)");
    }
}