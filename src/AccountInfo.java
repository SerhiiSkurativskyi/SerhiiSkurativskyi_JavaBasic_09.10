public class AccountInfo {
    private final String firstName;
    private String surname;
    private final int birthDateDay;
    private final int birthDateMonth;
    private final int birthDateYear;
    private final String email;
    private final long telNumber;
    private double weight;
    private int topPressure;
    private int lowPressure;
    private int stepsQuantity;


    public AccountInfo(String firstName, String surname, int birthDateDay, int birthDateMonth, int birthDateYear, String email,
                       long telNumber, double weight, int topPressure, int lowPressure, int stepsQuantity) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthDateDay = birthDateDay;
        this.birthDateMonth = birthDateMonth;
        this.birthDateYear = birthDateYear;
        this.email = email;
        this.telNumber = telNumber;
        this.weight = weight;
        this.topPressure = topPressure;
        this.lowPressure = lowPressure;
        this.stepsQuantity = stepsQuantity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDateDay() {
        return birthDateDay;
    }

    public int getBirthDateMonth() {
        return birthDateMonth;
    }

    public int getBirthDateYear() {
        return birthDateYear;
    }

    public String getEmail() {
        return email;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 250 && weight >= 30) {
            this.weight = weight;
        }
    }

    public int getTopPressure() {
        return topPressure;
    }

    public void setTopPressure(int topPressure) {
        if (topPressure <= 300 && topPressure >= 80) {
            this.topPressure = topPressure;
        }
    }

    public int getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(int lowPressure) {
        if (lowPressure <= 120 && lowPressure >= 50) {
            this.lowPressure = lowPressure;
        }
    }

    public int getStepsQuantity() {
        return stepsQuantity;
    }

    public void setStepsQuantity(int stepsQuantity) {
        if (stepsQuantity <= 120000) {
            this.stepsQuantity = stepsQuantity;
        }
    }

    void printAccountInfo() {
        int age = 2022 - birthDateYear;
        System.out.println("Пользователь: " + firstName + " " + surname + "; дата рождения: " + birthDateDay + "." + birthDateMonth + "." + birthDateYear + ";" +
                " возраст: " + age + " года; email: " + email + "; номер телефона: " + telNumber + "; вес: " + weight + "; " +
                "артериальное дваление: " + topPressure + "/" + lowPressure + "; количество пройденых шагов: " + stepsQuantity);

    }
}

