public class Person {
    String name;
    String surname;
    String city;
    long telNumber;

    void personInfo() {
        System.out.println("Позвонить гражданину " + name + " " + surname + " из города " + city + " можно по номеру " + telNumber);
    }
}
