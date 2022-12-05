    public enum DrinksMachine{
        COFFEE("кофе"),
        TEA("чай"),
        LEMONADE("лимонад"),
        MOJITO("мохито"),
        MINERAL_WATER("минеральная вода"),
        COCA_COLA("Кока-кола");
        private final String drinkName;
        DrinksMachine(String drinkName){
            this.drinkName=drinkName;
        }
        public String getDrinkName(){return drinkName;}




    }

