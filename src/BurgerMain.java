public class BurgerMain {
    public static void main(String[] args) {
        Burger standardBurger = new Burger("булочка", "мясо", "зелень", "майонез", "сыр");
        Burger dietBurger = new Burger("булочка", "мясо", "зелень", "сыр");
        Burger doubleBurger = new Burger("булочка", "мясо", "дополнительное мясо", "зелень", "майонез", "сыр");
    }
}
