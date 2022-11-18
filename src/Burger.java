public class Burger {
    String bread;
    String meat1;
    String meat2;
    String greens;
    String mayonnaise;
    String cheese;

    public Burger(String bread, String meat1, String greens, String mayonnaise, String cheese) {
        this.bread = bread;
        this.meat1 = meat1;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.cheese = cheese;
        System.out.println("Состав стандартного бургера: " + bread + ", " + meat1 + ", " + greens + ", " + mayonnaise + ", " + cheese);
    }

    public Burger(String bread, String meat1, String greens, String cheese) {
        this.bread = bread;
        this.meat1 = meat1;
        this.greens = greens;
        this.cheese = cheese;
        System.out.println("Состав диетического бургера: " + bread + ", " + meat1 + ", " + greens + ", " + cheese);
    }

    public Burger(String bread, String meat1, String meat2, String greens, String mayonnaise, String cheese) {
        this.bread = bread;
        this.meat1 = meat1;
        this.meat2 = meat2;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.cheese = cheese;
        System.out.println("Состав двойного бургера: " + bread + ", " + meat1 + ", " + meat2 + ", " + greens + ", " + mayonnaise + ", " + cheese);
    }
}



