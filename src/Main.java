import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] originMatrix;//объявляем исходную матрицу
        int min = 0;//задаём для рандомайзера минимальное значение в ячейке
        int max = 9;//задаём для рандомайзера максимальное значение в ячейке

        Scanner scan = new Scanner(System.in);//создаём сканнер
        System.out.println("Enter the number of rows: ");
        int rawsNum = scan.nextInt();//считывает первое число и присваивает значение в rawsNum
        System.out.println("Enter the number of columns: ");
        int columnsNum = scan.nextInt();//считывает второе число и присваивает значение в columnsNum

        originMatrix = new int[rawsNum][columnsNum];//формируем матрицу с указанным колличеством строк и столбцов

        //заполняем матрицу рандомными значениями в ранее указанном диапазоне
        for (int i = 0; i < rawsNum; i++) {  //идём по строкам
            for (int j = 0; j < columnsNum; j++) {//идём по столбцам
                originMatrix[i][j] = (int) Math.floor(Math.random() * (max - min + 1) + min);//с помощью рандомайзера заполняем строки и столбцы
            }
        }
        //печатаем исходную матрицу
        System.out.println("Origin matrix:");
        for (int i = 0; i < rawsNum; i++) {  //идём по строкам
            for (int j = 0; j < columnsNum; j++) {//идём по столбцам
                System.out.print(" " + originMatrix[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

//транспонируем матрицу
        int[][] transposedMatrix = new int[columnsNum][rawsNum]; //объявляем транспонированную матрицу и меняем местами колличество строк и столбцов
        //печатаем транспонированную матрицу
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) { //идём по строкам
            for (int j = 0; j < transposedMatrix[i].length; j++) {//идём по столбцам
                transposedMatrix[i][j] = originMatrix[j][i];//меняем значения местами
                     System.out.print(transposedMatrix[i][j] + " ");//вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }
}
