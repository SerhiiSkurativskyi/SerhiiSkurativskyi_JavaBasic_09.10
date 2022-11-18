public class BurgerMain {
    public static void main(String[] args) {
Burger standardBurger= new Burger("булочка","мясо","зелень","майонез","сыр");
        System.out.println("Состав стандартного бургера: "+ standardBurger.bread+", "+standardBurger.meat+", "+standardBurger.greens+", "+standardBurger.mayonnaise+", "+standardBurger.cheese);
Burger dietBurger= new Burger("булочка","мясо","зелень","сыр");
        System.out.println("Состав диетического бургера: "+ dietBurger.bread+", "+dietBurger.meat+", "+dietBurger.greens+", "+dietBurger.cheese);
Burger doubleBurger= new Burger("булочка","двойное мясо","зелень","майонез","сыр");
        System.out.println("Состав двойного бургера: "+ doubleBurger.bread+", "+doubleBurger.meat+", "+doubleBurger.greens+", "+doubleBurger.mayonnaise+", "+doubleBurger.cheese);
    }
}
