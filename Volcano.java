public class Volcano {
    private String name;
    private boolean active;
    private int lastEruptionYear;

    // Constructor
    public Volcano(String name, boolean active, int lastEruptionYear) {
        this.name = name;
        this.active = active;
        this.lastEruptionYear = lastEruptionYear;
    }

    // Method to describe the volcano
    public void describeVolcano() {
        System.out.println("Volcano Name: " + name);
        System.out.println("Active: " + active);
        System.out.println("Last Eruption Year: " + lastEruptionYear);
    }

    // Method to monitor the volcano
    public void monitorVolcano() {
        System.out.println("Monitoring the volcano " + name + "...");
        System.out.println("Active: " + active);
        System.out.println("Last Eruption Year: " + lastEruptionYear);
    }
}
