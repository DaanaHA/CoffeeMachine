package coffeemachine;

public class WasteTray extends Container{

    public WasteTray(Double capacity, Double level) {
        super(capacity, level);
    }

    public WasteTray() {
        setCapacity(500.0);
        setLevel(0.0);
    }

    @Override
    public void setLevel(Double level) {
        super.setLevel(level); 
    }

    @Override
    public Double getLevel() {
        return super.getLevel(); 
    }

    @Override
    public void setCapacity(Double capacity) {
        super.setCapacity(capacity); 
    }

    @Override
    public Double getCapacity() {
        return super.getCapacity(); 
    }
 

    public void clean() {
        if (getLevel()==200)
            setLevel(0.0);
    }
    
    public String getInfo() {
        return "Capacity: " + this.getCapacity() + "\nLevel: " + this.getLevel();
    }
    
    
}
