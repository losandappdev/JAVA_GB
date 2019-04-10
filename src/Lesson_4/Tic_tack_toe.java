package Lesson_4;

public class Tic_tack_toe {
    public static void main (String[] args){
        initField();
        printField();

    }

    static int SIZE_X = 3;
    static int SIZE_Y = 3;
    static char[][] field = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'X';
    static char AI_DOT = '0';
    static char EMPTY_DOT = '_';



    public static void initField(){     //Инициализация игрового поля
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printField(){     //Печать игрового поля.
        for (int i = 0; i < SIZE_X; i++) {
            if (i == 0) System.out.print("  " + (i+1));
            else System.out.print(" " + (i+1));
        }
        System.out.println();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print(i+1);
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                //System.out.print(j+1);
                System.out.print(field[i][j]+"|");
            }
            System.out.println();
        }

    }

}
