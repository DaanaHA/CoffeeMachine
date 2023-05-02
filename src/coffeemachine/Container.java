package coffeemachine;

public class Container {
    private double capacity;
    private double level;

  
    public Container(Double capacity, Double level) {
        this.capacity = capacity;
        this.level = level;
    }
    
      public Container() {
        this.capacity = 1000;//1kg or 1L
        this.level =1000 ;
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
    if(level!=0)
        level=level-amount;
    else System.out.println("Fill The Container");
    }
    public void fill(double amount){
    if(level==0)
    {
        setCapacity(1000.0);
        setLevel(1000.0);
        
        
    }
    else 
        System.out.println("It's Not Empty");
    }
    
    public String getInfo() {
        return  "" ;//The Container level Is "+ getLevel()+"\n The Container Capacity Is ="+getCapacity();
    }  
  
}
