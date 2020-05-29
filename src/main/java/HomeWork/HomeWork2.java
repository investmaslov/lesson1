package HomeWork;

import com.sun.codemodel.internal.JCase;

import javax.swing.*;
import java.sql.PreparedStatement;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Первое задание ");
        invertArray(0, 1);

        System.out.println(" ");
        System.out.println("Второе задание ");
        System.out.println("Первый способ ");
        fillArray();
        System.out.println("Второй Способ ");
        fillArray2();

        System.out.println(" ");
        System.out.println("Третье задание");
        System.out.println("Меньше 6 умножаем на 2");
        changeArray();

        System.out.println(" ");
        System.out.println("Четвертое задание");

        fillDiagonal();
    }


    /*
   1. Задать целочисленный массив, состоящий из элементов 0 и 1.
   Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */

    public static void invertArray(int a, int b) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("arr[" + i + "] = " + b);
            } else if (arr[i] == 1) {
                System.out.println("arr[" + i + "] = " + a);
            }
        }
    }

    /*
        Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    */
    // 1 способ :
    public static void fillArray() {

        int[] arr = new int[8];
        arr[0] = 0;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 9;
        arr[4] = 12;
        arr[5] = 15;
        arr[6] = 18;
        arr[7] = 21;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    // 2 способ :
    public static void fillArray2() {
        int[] arr = {0, 3, 6, 9, 12, 15, 18, 21};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    /*
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2;
    */
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                int a = w[i] * 2;
                System.out.println("arr[" + i + "] = " + a + " - результат умножили на 2");
            } else {
                System.out.println("arr[" + i + "] = " + w[i] + " - результат оставляем без изменений");
            }

        }
    }
/*
Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
*/
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        arr [0][0] = 1;
        arr [0][1] = 8;
        arr [0][2] = 8;
        arr [0][3] = 1;
        arr [1][0] = 8;
        arr [1][1] = 1;
        arr [1][2] = 1;
        arr [1][3] = 8;
        arr [2][0] = 8;
        arr [2][1] = 1;
        arr [2][2] = 1;
        arr [2][3] = 8;
        arr [3][0] = 1;
        arr [3][1] = 8;
        arr [3][2] = 8;
        arr [3][3] = 1;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] +  " ");
            }
            System.out.println();
        }
    }

}










