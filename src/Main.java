import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Choose the drink: ");
        String drinksChoice1 = in.nextLine();
        DrinksMachine drinksChoice2 = DrinksMachine.valueOf(drinksChoice1);

        switch (drinksChoice2) {
            case COFFEE:
                Drinks.coffeePreparing;
                break;
            case TEA:
                Drinks.teaPreparing;
                break;
            case LEMONADE:
                Drinks.lemonadePreparing;
                break;
            case MOJITO:
                Drinks. mojitoPreparing;
                break;
            case MINERAL_WATER:
                Drinks. mineralWaterPreparing;
                break;
            case COCA_COLA:
                Drinks.cocaColaPreparing;
                break;
            default:
                System.out.println("Your order is empty");
                break;
        }


        public static double orderSum = Drinks.coffeeCount * Drinks.COFFEE_PRICE + Drinks.teaCount * Drinks.TEA_PRICE + Drinks.lemonadeCount * Drinks.LEMONADE_PRICE +
                Drinks.mojitoCount * Drinks.MOJITO_PRICE + Drinks.mineralWaterCount * Drinks.MINERAL_WATER_PRICE + Drinks.cocaColaCount * Drinks.COCA_COLA_PRICE;

        System.out.println("Your order price is " + orderSum + "$");
    }


}
