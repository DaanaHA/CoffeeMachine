package coffeemachine;

public class CoffeeMachine {
    private WaterContainer waterContainer;
    private BeansContainer beansContainer;
    private WasteTray wasteTray;
    private Grinder grinder;
    private int counter;

    public CoffeeMachine() {
    }
    
    public CoffeeMachine(WaterContainer waterContainer, BeansContainer beansContainer, WasteTray wasteTray, Grinder grinder) {
        this.waterContainer = waterContainer;
        this.beansContainer = beansContainer;
        this.wasteTray = wasteTray;
        this.grinder = grinder;
        this.counter=0;
    }

    public WaterContainer getWaterContainer() {
        return waterContainer;
    }

    public void setWaterContainer(WaterContainer waterContainer) {
        this.waterContainer = waterContainer;
    }

    public BeansContainer getBeansContainer() {
        return beansContainer;
    }

    public void setBeansContainer(BeansContainer beansContainer) {
        this.beansContainer = beansContainer;
    }

    public WasteTray getWasteTray() {
        return wasteTray;
    }

    public void setWasteTray(WasteTray wasteTray) {
        this.wasteTray = wasteTray;
    }

    public Grinder getGrinder() {
        return grinder;
    }

    public void setGrinder(Grinder grinder) {
        this.grinder = grinder;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public void makeCupOfCoffee(int choice) throws Exception{
        switch (choice) {
            case 1:
                this.counter++;
                this.beansContainer.drain(7.0);
                this.waterContainer.drain(30.0);
                this.wasteTray.fill(10.0);
                break;
                
            case 2:
                this.counter++;
                this.beansContainer.drain(14.0);
                this.waterContainer.drain(60.0);
                this.wasteTray.fill(20.0);
                break;
                
            case 3:
                this.counter++;
                this.beansContainer.drain(7.0);
                this.waterContainer.drain(170.0);
                this.wasteTray.fill(10.0);
                break;
                
            case 4:
                this.counter++;
                this.beansContainer.drain(14.0);
                this.waterContainer.drain(220.0);
                this.wasteTray.fill(20.0);
                break;
        }
        
    }
    
    public void start() throws Exception {
        
        if (this.beansContainer.getLevel()==0) {
            throw new OutOfBeansException("Fill the beans container, please");
        }
        
        if (this.waterContainer.getLevel()==0) {
            throw new OutOfWaterException("Fill the water container, please");
        }
        
        if (this.wasteTray.getLevel()==this.wasteTray.getCapacity()) {
            throw new CleanException("Clean the waste tray, please.");
        }
    }
    
    
     
}
