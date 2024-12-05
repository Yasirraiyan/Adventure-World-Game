public class Desert {
    private String name;
    private String climate;
    private int area;

    // Constructor
    public Desert(String name, String climate, int area) {
        this.name = name;
        this.climate = climate;
        this.area = area;
    }

    // Method to describe the desert
    public void describeDesert() {
        System.out.println("Desert Name: " + name);
        System.out.println("Climate: " + climate);
        System.out.println("Area: " + area + " square kilometers");
    }

    // Method to explore the desert
    public void exploreDesert() {
        System.out.println("Exploring the desert " + name + "...");
        System.out.println("Climate: " + climate);
        System.out.println("Area: " + area + " square kilometers");
    }
}
