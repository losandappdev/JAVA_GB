package lesson_2;

import java.lang.annotation.ElementType;
import java.sql.Array;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {

        replasement0by1(new int[]{0, 1, 0, 1, 0, 1});
        replasement0by1(new  int[]{1,1,0,0,1,0,1,1,0,0});

        arrEx();

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

    static  void arrEx(){
    int[] arr8 = new int[8];
        for(int i = 0; i < arr8.length; i++) {
        arr8[i] = 3*i;
        }
        System.out.println(Arrays.toString(arr8));}

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

    static void crossFill(int[][] arr){
        int str, bkw;
        for(str = 0, bkw = arr.length - 1; str < arr.length; str++, bkw--){
            arr[str][bkw] = 1;
            arr[str][str] = 1;
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
        for(int  x :  arrCheck)
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




    static void arrayShift(int[] arr, int n){
        boolean flag;
        if (n < 0){
            flag = true;
            n = -n;
        }
            else {
                flag = false;
            }
        int lastIndex = arr.length - 1;

        for (int i = 0; i < n; i++) {
            int buffer = 0;
            if (flag) {
                buffer = arr[0];
            }
                else {
                    buffer = lastIndex;
            }

            for (int j = 0; j < lastIndex; j++) {
                if (flag){
                    arr[j] = arr[j+1];
                }
                    else {
                        arr[lastIndex-j] = arr[lastIndex-j-1];
                }
            }
            if (flag){
                arr[lastIndex] = buffer;
            }
                else{
                    arr[0] = buffer;
            }
        }
    }
}
