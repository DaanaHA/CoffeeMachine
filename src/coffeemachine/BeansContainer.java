package coffeemachine;

public class BeansContainer extends Container{
    private double ratio;

    public BeansContainer() {
    }

    public BeansContainer(double capacity, double level, double ratio) {
        super(capacity, level);
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public String getInfo() {
        return "Capacity: " + this.getCapacity() + "\nLevel: " + this.getLevel() + "\nRatio: " + this.ratio;
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
