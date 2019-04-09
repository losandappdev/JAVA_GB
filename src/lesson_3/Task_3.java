package lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Task_3 {
    public static void main(String[] args) {
        guessNumber();
        guessWord();




    }

    static void guessNumber() {
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

    static void guessWord() {
        String userWord;
        String serchWord;
        Scanner sc = new Scanner(System.in);
        serchWord = randomWord();
        char[] resWord = new char[15];
        for (int i = 0; i < 15; i++) resWord[i] = '#';

        //System.out.println(serchWord);  // Вывод загаданного слова.
        System.out.println("Угадай слово.");

        do {
            System.out.println("Напиши свой ответ: ");
            userWord = sc.nextLine();
            if (!userWord.equals(serchWord)) {
                System.out.println("Неверное слово!");
                System.out.println(Arrays.toString(wordAnalogLetter(userWord, serchWord, resWord)));
            }

        } while (!userWord.equals(serchWord));
        System.out.println("Угадал негодник!!!");

        }
    static String randomWord() {
    Random rnd = new Random();
    String word;
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    int wordNum = rnd.nextInt(words.length);
    return word = words[wordNum];

    }
    static char[] wordAnalogLetter(String userWord, String serchWord,char[] resultWord){
        int minWordLength;
        if (serchWord.length() < userWord.length() ) minWordLength = serchWord.length();
            else minWordLength = userWord.length();

        for (int i = 0; i < minWordLength ; i++) {
            if (serchWord.charAt(i) == userWord.charAt(i))
                    resultWord[i] = serchWord.charAt(i);

            }
        //System.out.println(Arrays.toString(resWord));
        return resultWord;
    }
}