public class Main {
    public static void main(String[] args) {
        AccountInfo account1 = new AccountInfo("Sylveste", "Stallone", 6, 7, 1946,
                "sly@gmail.com", 545646518, 89.1, 120, 80, 5000);
        AccountInfo account2 = new AccountInfo("Frank", "Sinatra", 12, 12, 1915,
                "franky@gmail.com", 444555, 86.5, 135, 90, 9000);
        AccountInfo account3 = new AccountInfo("Leonardo", "Dicaprio", 11, 11, 1974,
                "leo@gmail.com", 777777777, 83.3, 124, 87, 10000);
        account1.printAccountInfo();
        account2.printAccountInfo();
        account3.printAccountInfo();

        account1.setWeight(88);
        account1.setTopPressure(133);
        account1.setLowPressure(81);

        account3.setSurname("(Rocky) Stallone");
        account3.setStepsQuantity(25000);

        account1.printAccountInfo();
        account3.printAccountInfo();

    }
}