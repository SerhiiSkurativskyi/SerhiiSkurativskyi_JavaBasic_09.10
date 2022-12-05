import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Drinks {
    public static double COFFEE_PRICE = 30.2;
    public static double TEA_PRICE = 16.7;
    public static double LEMONADE_PRICE = 22.8;
    public static double MOJITO_PRICE = 55.6;
    public static double MINERAL_WATER_PRICE = 18.3;
    public static double COCA_COLA_PRICE = 20.1;

    public static int coffeeCount = 0;


    public void coffeePreparing() {
        System.out.println("Preparing coffee");
        coffeeCount++;
    }

    public static int teaCount = 0;

    public void teaPreparing(){
        System.out.println("Preparing tea");
        teaCount++;
    }

    public static int lemonadeCount = 0;

    public void lemonadePreparing() {
        System.out.println("Preparing lemonade");
        lemonadeCount++;
    }

    public static int mojitoCount = 0;

    public void mojitoPreparing () {
        System.out.println("Preparing mojito");
        mojitoCount++;
    }

    public static int mineralWaterCount = 0;

    public void mineralWaterPreparing () {
        System.out.println("Preparing mineral water");
        mineralWaterCount++;
    }

    public static int cocaColaCount = 0;

    public void cocaColaPreparing () {
        System.out.println("Preparing Coca-Cola");
        cocaColaCount++;
    }


}


