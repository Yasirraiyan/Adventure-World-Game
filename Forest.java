public class Forest {
    private String name;
    private String type;
    private int area;

    // Constructor
    public Forest(String name, String type, int area) {
        this.name = name;
        this.type = type;
        this.area = area;
    }

    // Method to describe the forest
    public void describeForest() {
        System.out.println("Forest Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Area: " + area + " hectares");
    }

    // Method to explore the forest
    public void exploreForest() {
        System.out.println("Exploring the forest " + name + "...");
        System.out.println("Type: " + type);
        System.out.println("Area: " + area + " hectares");
    }
}
