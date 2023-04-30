package coffeemachine;

public class Container {
    private double capacity;
    private double level;

    public Container() {
        
    }

    public Container(Double capacity, Double level) {
        this.capacity = capacity;
        this.level = level;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }
    
    public void drain(double amount){
    
    }
    public void fill(double amount){
    
    }
    
    public String getInfo() {
        return "";
    }  
    
}
