package Lesson_4;

import com.sun.source.tree.IfTree;

import java.lang.reflect.Field;
import java.text.FieldPosition;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Random;
import java.util.Scanner;

import jdk.nashorn.api.tree.GotoTree;

public class Tic_tack_toe {
    public static void main (String[] args){
        sizeField();
        initField();
        printField();

        while (true){

            playerStep();
            //printField();
            if (checkWin(PLAYER_DOT)){
                System.out.println("¡Player WIN!");
                break;
            }
            if (isFieldFul()){
                System.out.println("¡DRAW!");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)){
                System.out.println("¡SkyNet WIN!");
            }

        }

    }

    static int STEP_TO_WIN = 4; // Количество символов, идущих подряд, необходимых для победы.
    static int SIZE_X = 10;
    static int SIZE_Y = 10;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'X';
    static char AI_DOT = '0';
    static char EMPTY_DOT = '_';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void sizeField(){ //Задаем размерность поля.
        do {
            System.out.println("Введите размерность поля по горизонтали 3 - 9");
            SIZE_X = scanner.nextInt();
        }while (SIZE_X < 3 || SIZE_X > 9);
        do {
            System.out.println("Введите размерность поля по вертикали 3 - 9");
            SIZE_Y = scanner.nextInt();
        }while (SIZE_Y < 3 || SIZE_Y > 9);
    } //Задаем размерность поля.

    public static void initField(){//Инициализация игрового поля.
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }// Инициализация игрового поля

    public static void printField(){     //Печать игрового поля.
        for (int i = 0; i < SIZE_X; i++) {
            if (i == 0) System.out.print("   " + (i+1));
            else System.out.print(" " + (i+1));
        }
        System.out.println();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print(i+1+" ");
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j]+"|");
            }
            System.out.println();
        }

    }// Печать игрового поля.

    public static void playerStep(){  //Ход игрока.

        int x,y;
        do {
            System.out.println("Введите координаты: X и Y f в поле размером" + " " + SIZE_X +" * "+ SIZE_Y);
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isCellValid(x,y));
        setSym(x,y,PLAYER_DOT);
    }// Ход игрока.

    public static void aiStep(){  //Ход компьютера.
        int x,y;
        do {
            //System.out.println("Ход компьютера");
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        }while (!isCellValid(x,y));
        setSym(x,y,AI_DOT);
    }// Ход компьютера.
    public static void setSym(int x, int y, char sym){ // Заполнение ячейки.
        field[y][x] = sym;
    } // Заполнение ячейки.

    public static boolean isFieldFul(){// Проверка игрового поля на заполнение.
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT){
                    return false;
                }
            }
        }
        return true;
    }// Проверка игрового поля на заполнение.

    public static boolean checkWin(char sum){
      for (int i = 0; i < SIZE_Y; i++) {
        for (int j = 0; j < SIZE_X; j++) {
            if (checkWinHorizontal(i, j, sum)) {
                printField(); return true;
            }
            if (checkWinVertical(i, j, sum)) {
                printField(); return true;
            }
            if (checkWinDwnDiag(i, j, sum)){
                printField(); return true;
            }
            if (checkWinUpDiag(i, j, sum)){
                printField(); return true;
            }

        }

      }

      return false;
    }

    public static boolean checkWinHorizontal(int i, int j,char sum){
        int counter = 0;
        for (;j < SIZE_X; j++) {
            if (sum == field[i][j]) counter += 1;
                else break;
        }
        return counter == STEP_TO_WIN;
    }

    public static boolean checkWinVertical(int i, int j,char sum){
        int counter = 0;
        for (; i < SIZE_Y; i++) {
            if (sum == field[i][j]) counter += 1;
                else break;
        }
        return counter == STEP_TO_WIN;
    }

    public static boolean checkWinDwnDiag(int i, int j,char sum){
        int counter = 0;
        for (;i < SIZE_Y || j < SIZE_X ; i++, j++ ) {
                if (field[i][j] == sum) counter += 1;
                    else break;
        }
        return counter == STEP_TO_WIN ;
    }

    public static boolean checkWinUpDiag(int i, int j,char sum){
        int counter = 0;
        if (i > STEP_TO_WIN){
            for (; j < STEP_TO_WIN; i--, j++ ) {
                if (field[i][j] == sum) counter += 1;
            }
        }
        return counter == STEP_TO_WIN;
    }

    public static boolean isCellValid(int x, int y) { //Проверка ячейки.
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1){
        return false;
        }
        return field[y][x] == EMPTY_DOT;
        }// Проверка ячейки.


}
