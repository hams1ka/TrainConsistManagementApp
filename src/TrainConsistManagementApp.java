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
// ============================================================
// UC6: Map Bogie to Capacity (HashMap)
// Concepts: HashMap, Map Interface, put(), entrySet(),
//           Key-Value Association, Fast Lookup
// ============================================================
class UseCase6TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC6: Bogie Capacity Mapping   ");
        System.out.println("=================================");

        // HashMap maps each bogie name (key) to its capacity (value)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Map bogies to their seating capacities
        bogieCapacity.put("Sleeper",     72);
        bogieCapacity.put("AC Chair",    64);
        bogieCapacity.put("First Class", 18);
        bogieCapacity.put("General",     90);
        bogieCapacity.put("Pantry",       0);

        // Iterate using entrySet() — gives both key and value
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("  " + entry.getKey() +
                               " -> " + entry.getValue() + " seats");
        }

        // Fast lookup using key
        System.out.println("\nSleeper capacity    : " +
                           bogieCapacity.get("Sleeper"));
        System.out.println("First Class capacity: " +
                           bogieCapacity.get("First Class"));
    }
}
// ============================================================
// UC7: Sort Bogies by Capacity (Comparator)
// Concepts: Comparator Interface, Custom Objects, List,
//           sort(), Lambda Expressions
// ============================================================

// Bogie class — custom object with name and capacity
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name     = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (capacity: " + capacity + ")";
    }
}

class UseCase7TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC7: Sort Bogies by Capacity  ");
        System.out.println("=================================");

        // Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",      72));
        bogies.add(new Bogie("AC Chair",     64));
        bogies.add(new Bogie("First Class",  18));
        bogies.add(new Bogie("General",      90));
        bogies.add(new Bogie("Pantry",        0));

        // Sort using Comparator — ascending order by capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("\nBogies Sorted by Capacity (Low to High):");
        for (Bogie b : bogies) {
            System.out.println("  -> " + b);
        }
    }
}
// ============================================================
// UC8: Filter Passenger Bogies Using Streams
// Concepts: Stream API, stream(), filter(), collect(),
//           Lambda Expressions, Declarative Programming
// ============================================================
class UseCase8TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC8: Filter Bogies (Streams)  ");
        System.out.println("=================================");

        // Reuse Bogie list from UC7
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",     72));
        bogies.add(new Bogie("AC Chair",    64));
        bogies.add(new Bogie("First Class", 18));
        bogies.add(new Bogie("General",     90));
        bogies.add(new Bogie("Pantry",       0));

        // Stream pipeline: filter bogies with capacity > 60
        List<Bogie> highCapacity = bogies.stream()
            .filter(b -> b.capacity > 60) // Keep only bogies with capacity > 60
            .collect(Collectors.toList()); // Collect result into new list

        // Display filtered bogies
        System.out.println("\nBogies with Capacity > 60:");
        for (Bogie b : highCapacity) {
            System.out.println("  -> " + b);
        }

        System.out.println("\nTotal qualifying bogies: " + highCapacity.size());
    }
}
// ============================================================
// UC9: Group Bogies by Type (Collectors.groupingBy)
// Concepts: Collectors.groupingBy(), Stream Pipeline,
//           Map Output, Lambda Classification
// ============================================================
class UseCase9TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC9: Group Bogies by Type     ");
        System.out.println("=================================");

        // Create bogies with type categories
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper-B1",   72));
        bogies.add(new Bogie("Sleeper-B2",   72));
        bogies.add(new Bogie("AC Chair-C1",  64));
        bogies.add(new Bogie("AC Chair-C2",  64));
        bogies.add(new Bogie("General-G1",   90));
        bogies.add(new Bogie("Pantry",         0));

        // Group bogies by their type prefix using groupingBy
        // Classification: extract type from name (first word before '-')
        Map<String, List<Bogie>> grouped = bogies.stream()
            .collect(Collectors.groupingBy(b -> {
                // Extract type: "Sleeper-B1" -> "Sleeper"
                if (b.name.contains("-")) return b.name.split("-")[0];
                return b.name;
            }));

        // Display grouped bogies
        System.out.println("\nBogies Grouped by Type:");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("\n  Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("    -> " + b);
            }
        }
    }
}
// ============================================================
// UC10: Count Total Seats in Train (Stream reduce)
// Concepts: map(), reduce(), Method Reference,
//           Functional Aggregation, Stream Pipeline
// ============================================================
class UseCase10TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC10: Total Seat Count        ");
        System.out.println("=================================");

        // Reuse Bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",     72));
        bogies.add(new Bogie("AC Chair",    64));
        bogies.add(new Bogie("First Class", 18));
        bogies.add(new Bogie("General",     90));
        bogies.add(new Bogie("Pantry",       0));

        // Stream pipeline:
        // map() extracts capacity -> reduce() sums all values
        int totalSeats = bogies.stream()
            .map(b -> b.capacity)         // Transform Bogie to int
            .reduce(0, Integer::sum);     // Sum all capacities starting from 0

        // Display result
        System.out.println("\nBogie Breakdown:");
        for (Bogie b : bogies) {
            System.out.println("  " + b.name + " -> " + b.capacity + " seats");
        }
        System.out.println("\nTotal Seating Capacity: " + totalSeats + " seats");
    }
}
// ============================================================
// UC11: Validate Train ID & Cargo Codes (Regex)
// Concepts: Regular Expressions, Pattern Class,
//           Matcher Class, matches(), Format Enforcement
// ============================================================
class UseCase11TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC11: Validate IDs via Regex  ");
        System.out.println("=================================");

        // Define regex patterns
        // Train ID format: TRN- followed by exactly 4 digits
        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");

        // Cargo Code format: PET- followed by exactly 2 uppercase letters
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

        // Test Train IDs
        String[] trainIds = {"TRN-1234", "TRN-99", "TRN-5678", "ABC-1234"};
        System.out.println("\nTrain ID Validation:");
        for (String id : trainIds) {
            Matcher m = trainIdPattern.matcher(id);
            System.out.println("  " + id + " -> " +
                               (m.matches() ? "VALID ✓" : "INVALID ✗"));
        }

        // Test Cargo Codes
        String[] cargoCodes = {"PET-AB", "PET-ab", "PET-A", "PET-XY", "GDS-AB"};
        System.out.println("\nCargo Code Validation:");
        for (String code : cargoCodes) {
            Matcher m = cargoCodePattern.matcher(code);
            System.out.println("  " + code + " -> " +
                               (m.matches() ? "VALID ✓" : "INVALID ✗"));
        }
    }
}
// ============================================================
// UC12: Safety Compliance Check for Goods Bogies
// Concepts: Streams API, allMatch(), Lambda Expressions,
//           Conditional Logic in Streams, Business Rule Modeling
// ============================================================

// GoodsBogie — represents a goods/cargo bogie
class GoodsBogie {
    String bogieId;
    String shape;   // "Cylindrical" or "Rectangular"
    String cargo;   // "Petroleum", "Coal", "Steel", etc.

    public GoodsBogie(String bogieId, String shape, String cargo) {
        this.bogieId = bogieId;
        this.shape   = shape;
        this.cargo   = cargo;
    }

    @Override
    public String toString() {
        return bogieId + " [" + shape + " | " + cargo + "]";
    }
}

class UseCase12TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Train Consist Management App  ");
        System.out.println("  UC12: Safety Compliance Check ");
        System.out.println("=================================");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("G001", "Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("G002", "Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("G003", "Cylindrical", "Petroleum"));

        System.out.println("\nGoods Bogies:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println("  -> " + g);
        }

        // Safety rule: Cylindrical bogies can only carry Petroleum
        // allMatch() checks if ALL bogies pass the safety rule
        boolean isSafe = goodsBogies.stream()
            .allMatch(g -> {
                if (g.shape.equals("Cylindrical")) {
                    return g.cargo.equals("Petroleum"); // Must be petroleum
                }
                return true; // Rectangular bogies have no restriction here
            });

        System.out.println("\nSafety Compliance Result: " +
                           (isSafe ? "TRAIN IS SAFE ✓" : "SAFETY VIOLATION ✗"));

        // Test with a violation
        System.out.println("\n--- Testing with violation ---");
        goodsBogies.add(new GoodsBogie("G004", "Cylindrical", "Coal")); // Violation!

        boolean isSafe2 = goodsBogies.stream()
            .allMatch(g -> {
                if (g.shape.equals("Cylindrical")) {
                    return g.cargo.equals("Petroleum");
                }
                return true;
            });

        System.out.println("Safety Compliance Result: " +
                           (isSafe2 ? "TRAIN IS SAFE ✓" : "SAFETY VIOLATION ✗"));
    }
}