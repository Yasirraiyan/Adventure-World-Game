public class River
{
    private String name;
    private String challenge;
    private boolean hasBridge;

    // Constructor
    public River(String name, String challenge, boolean hasBridge) {
        this.name = name;
        this.challenge = challenge;
        this.hasBridge = hasBridge;
    }

    // Method to describe the river
    public void describeRiver()
    {
        System.out.println("River Name: " + name);
        System.out.println("Challenge: " + challenge);
        if (hasBridge) 
        {
            System.out.println("There is a bridge over the river.");
        } 
        else
        {
            System.out.println("There is no bridge over the river.");
        }
    }

    // Method to navigate the river
    public void navigateRiver() 
    {
        System.out.println("Navigating through the river " + name + "...");
        System.out.println("Facing the challenge: " + challenge);
        if (hasBridge) 
        {
            System.out.println("Crossing the bridge over the river.");
        } 
        else 
        {
            System.out.println("No bridge available, finding an alternate route.");
        }
    }
}
