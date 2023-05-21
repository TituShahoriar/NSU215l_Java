public class Main {
    static void add(Plant[] plants, Plant p) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] == null) {
                plants[i] = p;
                break;
            }
        }
    }

    static void remove(Plant[] plants, String n) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] != null && plants[i].getName().equals(n)) {
                plants[i] = null;
                break;
            }
        }
    }

    static Plant search(Plant[] plants, String n) {
        for (Plant plant : plants) {
            if (plant != null && plant.getName().equals(n)) {
                return plant;
            }
        }
        return null;
    }

    static void display(Plant[] plants) {
        for (Plant plant : plants) {
            if (plant != null) {
                System.out.println(plant.toString());
            }
        }
    }

    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

        // Create plant objects
        Plant p1 = new Plant("Plant 1", "Green");
        Flower f1 = new Flower("Flower 1", "Red", true, false);
        Herb h1 = new Herb("Herb 1", "Yellow", true, "Summer");

        // Add plants to the array
        add(plants, p1);
        add(plants, f1);
        add(plants, h1);

        // Display all plants
        display(plants);

        // Remove a plant by name
        remove(plants, "Plant 1");

        // Search for a plant by name
        Plant foundPlant = search(plants, "Herb 1");
        if (foundPlant != null) {
            System.out.println("Found plant: " + foundPlant.toString());
        } else {
            System.out.println("Plant not found.");
        }
    }
}
