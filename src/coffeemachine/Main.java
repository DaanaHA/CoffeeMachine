package coffeemachine;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        BeansContainer b1 = new BeansContainer(1000, 1000, 57);
        WaterContainer w1 = new WaterContainer(1000, 1000);
        Grender g1 = new Grender();
        WasteTray t1 = new WasteTray(500, 0);
        CoffeeMachine c1 = new CoffeeMachine(w1, b1, t1, g1);
        
        System.out.println("Menu:\n1.Espresso single shot.\n2.Espresso double shot.\n3.Americano single shot.\n4.Americano double shot.");
        switch (scan.nextInt()) {
            case 1:
                c1.makeCupOfCoffee(1);
                break;
                    
            case 2:
                c1.makeCupOfCoffee(2);
                break;
                    
            case 3:
                c1.makeCupOfCoffee(3);
                break;
                    
            case 4:
                c1.makeCupOfCoffee(4);
                break;
        }  
        
        System.out.println(c1.getBeansContainer().getInfo());
        
    }
}
