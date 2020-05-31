package lesson1;

import com.sun.tools.corba.se.idl.StructEntry;

import java.util.Scanner;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {

        randomGame();

        newStartRandomGame();
    }

/*  1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
    или меньше. После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/


    public static void randomGame() {
        System.out.println("Давай поиграем в игру Random Game ?");
        System.out.println("Я загадал число от 0 до 9 угадай какое ? У тебя есть три попытки ");
        Random rand = new Random();
        int x = rand.nextInt(9);
     //   System.out.println("Программа загадала число - " + x);
        System.out.println("   ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите свое число ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == x) {
                System.out.println(" Ура ты угадал программа загадала " + x + " " + "Твой результат такой же -  " + a);
                newStartRandomGame();
            } else if (a < x) {
                System.out.println("Неправильно число кторое вы указали МЕНЬШЕ , чем то которое загадала программа ");
            } else if (a > x) {
                System.out.println("Неправильно число кторое вы указали БОЛЬШЕ  , чем то, которое загадала программа ");
            }



        }
        System.out.println();
    }



    public static void newStartRandomGame() {

        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет");
        System.out.println("Введите свой ответ?  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 1) {
            randomGame();
        } else if (a == 0) {
            System.out.println("Игра закончена благодарим за игру!");
        }
    }
}











