package coffeemachine;

public class WasteTray {
    private double capacity;
    private double level;

    public WasteTray(double capacity, double level) {
        this.capacity = capacity;
        this.level = level;
    }

    public WasteTray() {
        setCapacity(500.0);
        setLevel(0.0);
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
        this.level=0.0;
    }
    
    public String getInfo() {
        return "Capacity: " + this.getCapacity() + "\nLevel: " + this.getLevel();
    }
    
    
}
