package coffeemachine;

public class WaterContainer extends Container{

    public WaterContainer() {
    }

    public WaterContainer(double capacity, double level) {
        super(capacity, level);
    }

    @Override
    public void drain(double amount) throws OutOfWaterException {
        if (this.getLevel()-amount < 0) {
            throw new OutOfWaterException("Fill the water container, please.");
        }
        else {
            this.setLevel(this.getLevel()-amount);
        }
    }
    
    @Override
    public String getInfo() {
        return "WATER CONTAINER INFO --> Capacity:" + this.getCapacity() + "   Level:" + this.getLevel();
    }
}
