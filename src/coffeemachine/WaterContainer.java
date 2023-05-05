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
    public void drain(int choice, double amount) {
        super.drain(choice, amount); //To change body of generated methods, choose Tools | Templates.
    }

}
