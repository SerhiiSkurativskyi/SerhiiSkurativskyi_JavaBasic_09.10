public class Person {
    public  String name;
    public String surname;
    public String city;
    public long telNumber;

      public Person(String name, String surname, String city, long telNumber) {
        this.name=name;
        this.surname=surname;
        this.city=city;
        this.telNumber=telNumber;
        System.out.println("Позвонить гражданину " + name + " " + surname + " из города " + city + " можно по номеру " + telNumber);
    }
}
