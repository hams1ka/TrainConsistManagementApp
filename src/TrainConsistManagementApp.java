// FILE: TrainConsistManagementApp.java
// Train Consist Management App - Base Setup

import java.util.*;
import java.util.stream.*;
import java.util.regex.*;

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