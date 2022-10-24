public class Main {
    public static void main(String[] args) {
        int four = 4;
        int nine = 9;
        int ten = 10;
        int oneHundred = 100;
        for (int shuttleNum = 1; shuttleNum <= 155; shuttleNum++) {
            if (shuttleNum % oneHundred % ten != four)
                if (shuttleNum % oneHundred % ten != nine)
                    if (shuttleNum % oneHundred % ten != shuttleNum % oneHundred - 40)
                        if (shuttleNum % oneHundred % ten != shuttleNum % oneHundred - 90) {
                            System.out.println(shuttleNum);
                        }
        }
    }
}


