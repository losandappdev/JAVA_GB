package lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Task_3 {
    public static void main(String[] args){

        guessNumber();

    }
    static void guessNumber(){
        Random rnd = new Random();
        int unknown;
        int continueGame;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Угадайте число от 0 до 10");
            unknown = rnd.nextInt(10);
            //System.out.println(unknown); // Вывод загаданного числа!!!
            int number, count = 0;
            do {
                do {

                    number = sc.nextInt();
                    if (number < 0 || number > 9) System.out.println("Вы ввели неправильное число");
                } while (number < 0 || number > 9);
                count++;
                if (number < unknown) System.out.println("Загаданное число больше.");
                else if (number > unknown) System.out.println("Згаданное число меньше.");
                    else System.out.println("Победа!!!");
            } while (unknown != number && count < 3);
            System.out.println("повторить игру еще раз");
            System.out.println("1 - да / 0 - нет");
            continueGame = sc.nextInt();

        } while (continueGame == 1);

        System.out.println("Досвидания");
    }


}