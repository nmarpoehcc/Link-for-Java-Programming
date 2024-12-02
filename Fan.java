public class Fan {
    
    // Constants to represent fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    // Private fields
    private int speed;     // Speed of the fan (default is SLOW)
    private boolean on;    // Whether the fan is on or off (default is false)
    private double radius; // Radius of the fan (default is 5.0)
    private String color;  // Color of the fan (default is "blue")
    
    // No-argument constructor that creates a default fan
    public Fan() {
        this.speed = SLOW;  // Default speed is SLOW
        this.on = false;    // Default is that the fan is off
        this.radius = 5.0;  // Default radius is 5
        this.color = "blue"; // Default color is blue
    }
    
    // Accessor (getter) and mutator (setter) methods for each data field
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public boolean isOn() {
        return on;
    }
    
    public void setOn(boolean on) {
        this.on = on;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Method to return a string description of the fan
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Color: " + color + ", radius: " + radius + " -- fan is off";
        }
    }
    public static void main(String[] args) {
        // Create the first Fan object and set its properties
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);    // Set the speed to FAST
        fan1.setRadius(10);     // Set the radius to 10
        fan1.setColor("yellow"); // Set the color to yellow
        fan1.setOn(true);       // Turn the fan on

        // Create the second Fan object and set its properties
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);  // Set the speed to MEDIUM
        fan2.setRadius(5);      // Set the radius to 5
        fan2.setColor("blue");  // Set the color to blue
        fan2.setOn(false);      // Turn the fan off

        // Display the description of both fans using their toString() method
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
