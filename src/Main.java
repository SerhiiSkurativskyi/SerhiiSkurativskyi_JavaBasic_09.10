public class Main {
    public static void main(String[] args) {
        int unluckyNum1 = 4;
        int unluckyNum2 = 9;
        int shuttleMaxCount = 100;
        int counter = 0;
        for (int shuttleNum = 1; shuttleNum > 0; shuttleNum++) {
            if (shuttleNum % 100 % 10 != unluckyNum1
                    && shuttleNum % 100 % 10 != unluckyNum2
                    && shuttleNum % 100 % 10 != shuttleNum % 100 - unluckyNum1 * 10
                    && shuttleNum % 100 % 10 != shuttleNum % 100 - unluckyNum2 * 10) {
                System.out.println(shuttleNum);
                counter++;
                if (counter == shuttleMaxCount)
                break;
            }
        }
    }
}

