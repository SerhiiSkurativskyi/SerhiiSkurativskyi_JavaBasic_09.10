import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Drinks drinks = new Drinks();

        int maxDrinksCount = 100;

        for (int i = 0; i < maxDrinksCount; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Choose the drink: ");
            String drinksChoiceString = in.nextLine();
            DrinksMachine drinksChoiceEnum = DrinksMachine.valueOf(drinksChoiceString);

            switch (drinksChoiceEnum) {
                case COFFEE:
                    drinks.coffeePreparing();
                    break;
                case TEA:
                    drinks.teaPreparing();
                    break;
                case LEMONADE:
                    drinks.lemonadePreparing();
                    break;
                case MOJITO:
                    drinks.mojitoPreparing();
                    break;
                case MINERAL_WATER:
                    drinks.mineralWaterPreparing();
                    break;
                case COCA_COLA:
                    drinks.cocaColaPreparing();
                    break;
                default:
                    System.out.println("Your order is empty");
                    break;
            }
            Drinks.orderSum();
        }
    }
}

