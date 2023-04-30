/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachine;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        coffeemachine.CoffeeMachine c = new coffeemachine.CoffeeMachine();
        
        while(true) {
            System.out.println("Menu:\n1.Espresso single shot.\n2.Espresso double shot.\n3.Americano single shot.\n4.Americano double shot.");
            switch (scan.nextInt()) {
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
            }
        }
        
    }
}
