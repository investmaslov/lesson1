package lesson1;

import com.sun.tools.corba.se.idl.StructEntry;

import java.util.Scanner;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {



        randomGame();

        newStartRandomGame();

        start();
    }

/*  1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
    или меньше. После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/


    public static void start() {
        System.out.println("Вы ввели некорректный ответ! Выберите правильный ответ! Спасибо!");
        newStartRandomGame();
    }


    public static void randomGame() {
        System.out.println("Давай поиграем в игру Random Game ?");
        System.out.println("Я загадал число от 0 до 9 угадай какое ? У тебя есть три попытки ");
        Random rand = new Random();
        int x = rand.nextInt(9);

        System.out.println("Программа загадала число - " + x);

        System.out.println("   ");

        //программа на этом этапе просит пользователя ввести свое число

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите свой вариант числа: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            //программа на этом этапе сравнивает два числа x и a
            if (a == x) {
                System.out.println(" Ура ты угадал программа загадала " + x + " " + "Твой результат такой же -  " + a);
                newStartRandomGame();
            } else if (a < x) {
                System.out.println("Неправильно! Число " + a + ", которое вы указали МЕНЬШЕ , чем то которое загадала программа ");

            } else if (a > x) {
                System.out.println("Неправильно! Число " + a + ", которое вы указали БОЛЬШЕ  , чем то, которое загадала программа ");
            }
        }


    }


    public static void newStartRandomGame() {

        System.out.println("Начать или Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет");
        System.out.println("Введите свой ответ?  ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        if (b == 1) {
            randomGame();
        } else if (b == 0) {
            System.out.println("Игра закончена благодарим за игру!");
        } else if (b < 1) {

            start();
        }


    }
}











