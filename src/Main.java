public class Main {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.name = "Jean Cloud";
        person1.surname ="Van Damme";
        person1.city = "Bila Tserkva";
        person1.telNumber = 1231354697;
        person1.personInfo();

        Person person2=new Person();
        person2.name = "Elon";
        person2.surname ="Mask";
        person2.city = "Mars";
        person2.telNumber = 1515151515;
        person2.personInfo();

        Person person3=new Person();
        person3.name = "Dwayne";
        person3.surname ="Johnson";
        person3.city = "Honolulu";
        person3.telNumber = 987456123;
        person3.personInfo();

    }
}