import java.util.Arrays;

public class Main {
    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayCompany = {1, 5, 9, 7, 4, 3, 1};
        int[] arrayClient = {6, 9, 5, 2, 1, 7, 0};
        sort(arrayCompany);
        sort(arrayClient);
        int result = 1;
        System.out.print(Arrays.toString(arrayCompany) + "\n");
        System.out.print(Arrays.toString(arrayClient) + "\n");

        int matches = 0;
        for (int i = 0; i < arrayCompany.length; i++) {
            while (arrayCompany[i] != arrayClient[i])
                i++;
            if (arrayCompany[i] == arrayClient[i])
                matches++;
        }
        System.out.println("Количество совпадений: " + matches);
    }

}

