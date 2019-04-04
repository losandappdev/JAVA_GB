package lesson_2;

import java.sql.Array;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {

        replasement0by1(new int[]{0, 1, 0, 1, 0, 1});
        replasement0by1(new  int[]{1,1,0,0,1,0,1,1,0,0});


        int[] arr8 = new int[8];
        for (int i = 0; i < arr8.length ; i++) {
            arr8[i] = 3*i;
        }
        System.out.println(Arrays.toString(arr8));

        numberLess6mul2(new int[]{1,5,3,2,11,4,5,2,4,8,9,1});

        sqareArray(6);

        arrayMaxMin(10);

        System.out.println(checkBalannse(new int[]{5, 10, 5, 10, 5, 23, 6}));
        System.out.println(checkBalannse(new int[]{5, 10, 15, 5, 25}));
        System.out.println(checkBalannse(new int[]{5, 10, 5, 10, 5, 23, 58}));


    }
    static void replasement0by1 ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
          arr[i] =  (arr[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void numberLess6mul2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6)? arr[i] * 2: arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    static void sqareArray(int arrLength){
            int sqareArr[][] = new int[arrLength][arrLength];
            for (int i = 0; i < arrLength ; i++) {
                for (int j = 0; j < arrLength ; j++) {
                    if (i==j || arrLength - i - 1 == j){
                        sqareArr[i][j] = 1;
                    }
                        else sqareArr[i][j] = 0;
                }
                 System.out.println(Arrays.toString(sqareArr[i]));
            }
    }

    static void arrayMaxMin(int size){
        int[] arr = new int[size];                  // Cоздание и
        int max = 0, min = 100;                     // инициализация массива
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random()*30);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < size; i++) {            // Поиск
            if (arr[i] < min){                      // минимального элемента.
             min = arr[i];

            }

        }                                           // поиск минимального элемента.
        System.out.println("Минимальный элемент массива: " + min);

        Arrays.sort(arr);
        System.out.println("Максимальный элемент массива: " + arr[size-1]);
    }

    static boolean checkBalannse(int[] arrCheck){
        int rsumm = 0, lsumm = 0;  // Сумма правых и левых элементов.
        boolean result = false;
        for(int x:  arrCheck)
            rsumm +=x;

       for (int i = 0; i < arrCheck.length; i++) {
           if (rsumm != lsumm) {
               rsumm = rsumm - arrCheck[i];
               lsumm = lsumm + arrCheck[i];
            }
              else   result = true;
       }
        return result;

    }

}



