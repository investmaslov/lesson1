package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {

        calculate(1, 2, 3, 4);
        task10and20(1, 2);
        isPositiveOrNegative(-1);
        System.out.println(isNegative(-1));
        greetings("Vladimir", "Maslov");
        leapYear(2020);

    }

    /* 1. Создать переменные всех пройденных типов данных и инициализировать их значения.
    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.
*/

    public static void calculate(int a, int b, int c, int d) {
        float result = (float) (a * (b + (c / d)));
        System.out.println("result = " + result);
    }

    /*2. Написать метод, принимающий на вход два целых числа и проверяющий,
     что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
     в противном случае – false.
*/

    public static void task10and20(int x1, int x2) {

        int sum = x1 + x2;

        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    /*Написать метод, которому в качестве параметра передается целое число,
     метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     Замечание: ноль считаем положительным числом.
     */

    public static void isPositiveOrNegative(int x) {

        if (x >= 0) {
            System.out.println(x + " - число положительное");
        } else {
            System.out.println(x + " - число отрицательное");
        }

    }

      /* 6. Написать метод, которому в качестве параметра передается целое число.
      Метод должен вернуть true, если число отрицательное.
      */

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    /*    7. Написать метод, которому в качестве параметра передается строка,
       обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */

    public static void greetings(String name, String surname) {

        System.out.println("«Привет," + name + " " + surname + "!»");
    }


    /*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */


    public static void leapYear(int x) {

        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
            System.out.println( x + "Год является Високосным");
        } else {
            System.out.println( x + "Год не является Високосным");
        }

    }



}
