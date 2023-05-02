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

    @Override
    public void fill(double amount) {
        super.fill(amount); 
    }

    @Override
    public void drain(double amount) {
        super.drain(amount); 
    }
    
    
    
     
    
     
}
