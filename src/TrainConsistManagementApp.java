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