package coffeemachine;

public class WaterContainer extends Container{

    public WaterContainer() {
    }

    public WaterContainer(double capacity, double level) {
        super(capacity, level);
    }

    @Override
    public String getInfo() {
        return "Capacity: " + this.getCapacity() + "\nLevel: " + this.getLevel();
    }
    
    
     
    
     
}
