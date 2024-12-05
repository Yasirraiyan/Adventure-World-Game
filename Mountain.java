public class Mountain {
    private String name;
    private String condition;
    private int height;

    // Constructor
    public Mountain(String name, String condition, int height) {
        this.name = name;
        this.condition = condition;
        this.height = height;
    }

    // Method to describe the mountain
    public void describeMountain() {
        System.out.println("Mountain Name: " + name);
        System.out.println("Condition: " + condition);
        System.out.println("Height: " + height + " meters");
    }

    // Method to climb the mountain
    public void climbMountain() {
        System.out.println("Climbing the mountain " + name + "...");
        System.out.println("Condition: " + condition);
        System.out.println("Height: " + height + " meters");
    }
}
