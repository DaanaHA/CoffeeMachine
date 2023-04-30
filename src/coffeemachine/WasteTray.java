package coffeemachine;

public class WasteTray {
    private double capacity;
    private double level;

    public WasteTray() {
    }

    public WasteTray(double capacity, double level) {
        this.capacity = capacity;
        this.level = level;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public void clean() {
        
    }
    
    public String getInfo() {
        return "Capacity: " + this.getCapacity() + "\nLevel: " + this.getLevel();
    }
    
    
}
