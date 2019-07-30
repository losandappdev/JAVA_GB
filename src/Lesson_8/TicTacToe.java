package Lesson_8;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main (String[] args){
        new GameWindow();
//        sizeField();
//        initField();
//        printField();
//
//
//        while (true){
//
//            playerStep();
//            printField();
//            if (checkWin(PLAYER_DOT)){
//                System.out.println("¡Player WIN!");
//                break;
//            }
//            if (isFieldFul()){
//                System.out.println("¡DRAW!");
//                break;
//            }
//            //aiStep();
//            artificialIntelStep();
//            //printField();
//            if (checkWin(AI_DOT)){
//                System.out.println("¡SkyNet WIN!");
//            }
//
//        }
//
//    }
//
//    static int STEP_TO_WIN = 3; // Количество символов, идущих подряд, необходимых для победы.
//    static int SIZE_X = 10;
//    static int SIZE_Y = 10;
//
//    static char[][] field = new char[SIZE_Y][SIZE_X];
//
//    static char PLAYER_DOT = 'X';
//    static char AI_DOT = '0';
//    static char EMPTY_DOT = '_';
//
//    static Scanner scanner = new Scanner(System.in);
//    static Random random = new Random();
//
//    public static void sizeField(){ //Задаем размерность поля.
//        do {
//            System.out.println("Введите размерность поля по горизонтали 3 - 9");
//            SIZE_X = scanner.nextInt();
//        }while (SIZE_X < 3 || SIZE_X > 9);
//        do {
//            System.out.println("Введите размерность поля по вертикали 3 - 9");
//            SIZE_Y = scanner.nextInt();
//        }while (SIZE_Y < 3 || SIZE_Y > 9);
//    } //Задаем размерность поля.
//
//    public static void initField(){//Инициализация игрового поля.
//        for (int i = 0; i < SIZE_Y; i++) {
//            for (int j = 0; j < SIZE_X; j++) {
//                field[i][j] = EMPTY_DOT;
//            }
//        }
//    }// Инициализация игрового поля
//
//    public static void printField(){     //Печать игрового поля.
//        for (int i = 0; i < SIZE_X; i++) {
//            if (i == 0) System.out.print("   " + (i+1));
//            else System.out.print(" " + (i+1));
//        }
//        System.out.println();
//        for (int i = 0; i < SIZE_Y; i++) {
//            System.out.print(i+1+" ");
//            System.out.print("|");
//            for (int j = 0; j < SIZE_X; j++) {
//                System.out.print(field[i][j]+"|");
//            }
//            System.out.println();
//        }
//
//    }// Печать игрового поля.
//
//    public static void playerStep(){  //Ход игрока.
//
//        int x,y;
//        do {
//            System.out.println("Введите координаты: X и Y f в поле размером" + " " + SIZE_X +" * "+ SIZE_Y);
//            x = scanner.nextInt() - 1;
//            y = scanner.nextInt() - 1;
//        }while (!isCellValid(x,y));
//        setSym(x,y,PLAYER_DOT);
//    }// Ход игрока.
//
//    public static void aiStep(){  //Ход компьютера.
//        int x,y;
//        do {
//            x = random.nextInt(SIZE_X);
//            y = random.nextInt(SIZE_Y);
//        }while (!isCellValid(x,y));
//        setSym(x,y,AI_DOT);
//        printField();
//    }// Ход компьютера.
//
//    public static void setSym(int x, int y, char sym){ // Заполнение ячейки.
//        field[y][x] = sym;
//    } // Заполнение ячейки.
//
//    public static boolean isFieldFul(){// Проверка игрового поля на заполнение.
//        for (int i = 0; i < SIZE_Y; i++) {
//            for (int j = 0; j < SIZE_X; j++) {
//                if (field[i][j] == EMPTY_DOT){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }// Проверка игрового поля на заполнение.
//
//    public static boolean checkWin(char sum){
//        for (int i = 0; i < SIZE_Y; i++) {
//            for (int j = 0; j < SIZE_X; j++) {
//                if (checkWinHorizontal(i, j, sum) == STEP_TO_WIN) {
//                    printField(); return true;
//                }
//                if (checkWinVertical(i, j, sum) == STEP_TO_WIN) {
//                    printField(); return true;
//                }
//                if (checkWinDwnDiag(i, j, sum) == STEP_TO_WIN){
//                    printField(); return true;
//                }
//                if (checkWinUpDiag(i, j, sum) == STEP_TO_WIN){
//                    printField(); return true;
//                }
//
//            }
//
//        }
//
//        return false;
//    }
//
//    public static int checkWinHorizontal(int i, int j,char sum){
//        int counter = 0;
//        for (;j < SIZE_X; j++) {
//            if (sum == field[i][j]) counter += 1;
//            else break;
//        }
//        return counter;
//    }
//
//    public static int checkWinVertical(int i, int j,char sum){
//        int counter = 0;
//        for (; i < SIZE_Y; i++) {
//            if (sum == field[i][j]) counter += 1;
//            else break;
//        }
//        return counter;
//    }
//
//    public static int checkWinDwnDiag(int i, int j,char sum){
//        int counter = 0;
//        for (;i < SIZE_Y || j < SIZE_X ; i++, j++ ) {
//            if (field[i][j] == sum) counter += 1;
//            else break;
//        }
//        return counter;
//    }
//
//    public static int checkWinUpDiag(int i, int j,char sum){
//        int counter = 0;
//        if (i > STEP_TO_WIN - 2){
//            for (; j < STEP_TO_WIN; i--, j++ ) {
//                if (field[i][j] == sum) counter += 1;
//                else break;
//            }
//        }
//        return counter;
//    }
//
//    public static boolean isCellValid(int x, int y) { //Проверка ячейки.
//        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1){
//            return false;
//        }
//        return field[y][x] == EMPTY_DOT;
//    }// Проверка ячейки.
//
//    public static void artificialIntelStep(){ // Искуственнвй интелект неуспел.
//        for (int i = 0; i < SIZE_Y; i++) {
//            for (int j = 0; j < SIZE_X; j++) {
//              System.out.println(checkWinHorizontal(i, j, PLAYER_DOT) + " ");
//                System.out.println(checkWinVertical(i, j,PLAYER_DOT ) + " ");
//              System.out.print(checkWinUpDiag(i, j,PLAYER_DOT) + " " );
//              System.out.print(checkWinDwnDiag(i, j, PLAYER_DOT) + " ");
//              System.out.println();

//              if (checkWinHorizontal(i, j, PLAYER_DOT) > 1){
//                 if (isCellValid(i + checkWinHorizontal(i, j, PLAYER_DOT),j )){
//                   setSym(i + checkWinHorizontal(i, j, PLAYER_DOT), j,AI_DOT);
//                   printField();break;
//                 }
//                 else if (isCellValid(i - 1,j)){
//                    setSym(i - 1,j,AI_DOT);
//                    printField();break;
//                 }
//              }
//                if (checkWinVertical(i, j, PLAYER_DOT) > 1) {
//                    if (isCellValid(i, j + checkWinVertical(i, j, PLAYER_DOT))) {
//                        setSym(i, j + checkWinVertical(i, j, PLAYER_DOT), AI_DOT);
//                        printField();break;
//                    } else if (isCellValid(i - 1, j)) {
//                        setSym(i - 1, j, AI_DOT);
//                        printField();break;
//                    }
//                }
//                 if (checkWinDwnDiag(i, j, PLAYER_DOT) > 1) {
//                     if (isCellValid(i + checkWinHorizontal(i, j, PLAYER_DOT), j + checkWinHorizontal(i, j, PLAYER_DOT))) {
//                         setSym(i + checkWinHorizontal(i, j, PLAYER_DOT), j + checkWinHorizontal(i, j, PLAYER_DOT), AI_DOT);
//                         printField();break;
//                     } else if (isCellValid(i - 1, j - 1)) {
//                         setSym(i - 1, j - 1, AI_DOT);
//                         printField();break;
//                     }else aiStep();break;
//                 }
//                 if (checkWinUpDiag(i, j, PLAYER_DOT) > 1) {
//                     if (isCellValid(i - checkWinHorizontal(i, j, PLAYER_DOT), j + checkWinHorizontal(i, j, PLAYER_DOT))) {
//                         setSym(i - checkWinHorizontal(i, j, PLAYER_DOT), j + checkWinHorizontal(i, j, PLAYER_DOT), AI_DOT);
//                         printField();break;
//                     } else if (isCellValid(i + 1, j - 1)) {
//                         setSym(i + 1, j - 1, AI_DOT);
//                         printField();break;
//                     }else aiStep();break;
//                 }
//                 if (checkWinHorizontal(i, j, PLAYER_DOT) == 1 &&  checkWinVertical(i, j,PLAYER_DOT )== 1
//                 &&  checkWinDwnDiag(i, j, PLAYER_DOT) == 1){
//                     System.out.println();
//                     aiStep();
//                     break;
//                 }
            }
        }
//    } Искустверрый интелект не успел.
//    Идея в том чтобы теми же методами что и проверка на выигрышь (которые возвращают количество
//    одинаковых символов в заданном направлени) проверять поле на рябом стоящие
//    символы игрока которых меньше чем STEP_TO_WIN, а затем до или после них ставить нолик
//    в зависимости направления поверки и  вылидности ячейки.
//}