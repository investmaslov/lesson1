package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {


        randomGame();

    }

//  1. Написать программу, которая загадывает случайное число от 0 до 9,
//    и пользователю дается 3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
//    или меньше. После победы или проигрыша выводится запрос –
//    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


    public static void randomGame() {


        Random rand = new Random();

        int tryCount = 3;
        int repeat = 0;
        int userOption;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Компьютер загадал случайное число");
            int xRanodom = rand.nextInt(10);

            boolean isWin = false;

            for (int current = 1; current <= tryCount; current++) {
                System.out.println("Введите свой варинат попытка № - " + current);
                userOption = sc.nextInt();
                if (userOption < xRanodom) {
                    System.out.println("Неправильно! Число " + userOption + ", МЕНЬШЕ , чем то которое загадала программа ");
                } else if (userOption > xRanodom) {
                    System.out.println("Неправильно! Число " + userOption + " БОЛЬШЕ  , чем то, которое загадала программа ");
                } else {
                    System.out.println(" ВЕРНО Твой результат" + userOption + "такой же -  " + xRanodom);
                    isWin = true;
                    break;
                }
            }
            System.out.println(isWin ? "Вы победили!" : "Вы проиграли. правильное число" + xRanodom);
            System.out.println("Повторить игру - 1 / Закончить игру - 0 ");
            repeat = sc.nextInt();
            if (repeat == 0) break;
            else if (repeat != 0 || repeat != 1) {
                System.out.println("Вы ввели неправильное значение");
                System.out.println("Введите правильное значение");
                System.out.println("Повторить игру - 1 / Закончить игру - 0 ");
            }
        } while (repeat == 1);
    }
}
















