public class Drinks {
    public static final double COFFEE_PRICE = 30.2;
    public static final double TEA_PRICE = 16.7;
    public static final double MOJITO_PRICE = 55.6;
    public static final double LEMONADE_PRICE = 28.7;
    public static final double MINERAL_WATER_PRICE = 18.3;
    public static final double COCA_COLA_PRICE = 20.1;

    public static int coffeeCount = 0;


    public void coffeePreparing() {
        System.out.println("Preparing coffee");
        coffeeCount++;
    }

    public static int teaCount = 0;

    public void teaPreparing() {
        System.out.println("Preparing tea");
        teaCount++;
    }

    public static int lemonadeCount = 0;

    public void lemonadePreparing() {
        System.out.println("Preparing lemonade");
        lemonadeCount++;
    }

    public static int mojitoCount = 0;

    public void mojitoPreparing() {
        System.out.println("Preparing mojito");
        mojitoCount++;
    }

    public static int mineralWaterCount = 0;

    public void mineralWaterPreparing() {
        System.out.println("Preparing mineral water");
        mineralWaterCount++;
    }

    public static int cocaColaCount = 0;

    public void cocaColaPreparing() {
        System.out.println("Preparing Coca-Cola");
        cocaColaCount++;
    }

    public static void orderSum() {
        double sum = Drinks.coffeeCount * Drinks.COFFEE_PRICE + Drinks.teaCount * Drinks.TEA_PRICE + Drinks.lemonadeCount * Drinks.LEMONADE_PRICE +
                Drinks.mojitoCount * Drinks.MOJITO_PRICE + Drinks.mineralWaterCount * Drinks.MINERAL_WATER_PRICE + Drinks.cocaColaCount * Drinks.COCA_COLA_PRICE;
        System.out.println("Your order price is " + sum + "$");
    }
}


