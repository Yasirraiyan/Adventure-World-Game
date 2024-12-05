public class Island {
    private String name;
    private String location;
    private double area;

    // Constructor
    public Island(String name, String location, double area) {
        this.name = name;
        this.location = location;
        this.area = area;
    }

    // Method to describe the island
    public void describeIsland() {
        System.out.println("Island Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Area: " + area + " square kilometers");
    }

    // Method to explore the island
    public void exploreIsland() {
        System.out.println("Exploring the island " + name + "...");
        System.out.println("Location: " + location);
        System.out.println("Area: " + area + " square kilometers");
    }
}
