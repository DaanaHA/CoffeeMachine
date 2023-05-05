package coffeemachine;

public class CoffeeMachine {
    private WaterContainer waterContainer;
    private BeansContainer beansContainer;
    private WasteTray wasteTray;
    private Grender grinder;
    private static int counter;

    public CoffeeMachine() {
    }
    
    public CoffeeMachine(WaterContainer waterContainer, BeansContainer beansContainer, WasteTray wasteTray, Grender grinder) {
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

    public Grender getGrinder() {
        return grinder;
    }

    public void setGrinder(Grender grinder) {
        this.grinder = grinder;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public void makeCupOfCoffee(int choice){
        switch (choice) {
            case 1:
                this.counter++;
                this.beansContainer.drain(7.0);
                this.waterContainer.drain(30.0);
                this.wasteTray.setLevel(this.wasteTray.getLevel()+10);
                break;
                
            case 2:
                this.counter++;
                this.beansContainer.drain(14.0);
                this.waterContainer.drain(60.0);
                this.wasteTray.setLevel(this.wasteTray.getLevel()+20);
                break;
                
            case 3:
                this.counter++;
                this.beansContainer.drain(7.0);
                this.waterContainer.drain(170.0);
                this.wasteTray.setLevel(this.wasteTray.getLevel()+10);
                break;
                
            case 4:
                this.counter++;
                this.beansContainer.drain(14.0);
                this.waterContainer.drain(220.0);
                this.wasteTray.setLevel(this.wasteTray.getLevel()+20);
                break;
        }
        
    }
    
    public void start() {
        try {
            if (this.beansContainer.getLevel()==0) {
                throw new OutOfBeansException("Fill the beans container, please");
            }
        }
        catch (OutOfBeansException ex) {
            
        }
        
    }
    
    
     
}
