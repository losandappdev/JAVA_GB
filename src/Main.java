import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        byte t_1 = 10;
        short t_2 = 20;
        int t_3 = 70;
        long t_4 = 80;

        float t_5 = 90.6f;
        double t_6 = 107.4;

        boolean t_7;

        char t_8 = 'v';
        String t_9 = "Hello";

        System.out.println(evaluateExpression(5,2,1,1));

        System.out.println(summInRrange_10_20(15,20));
        System.out.println(summInRrange_10_20(6,6));

        positiveOrNegative(-7);
        positiveOrNegative(0);
        positiveOrNegative(9);

        greeting("Peter");

        leapYear(400);
        leapYear(100);
        leapYear(2005);
        leapYear(2004);
        leapYear(2019);
        int[] a =  randomArray(10);//{5,8,9,65,11,3,6};
        bubleSort(a);
        System.out.println(Arrays.toString(bubleSort(randomArray(10))));


    }
    static int evaluateExpression(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    static boolean summInRrange_10_20(int a, int b){
        return a + b > 10 && a + b < 20;
    }
    static void positiveOrNegative(int number){
           System.out.println("You number is " + ((number >= 0)? "positive": "negative") + "!");
         /*if (number < 0) System.out.println("Negative");
        else System.out.println("Positive");*/
    }
    static void greeting(String name){
        System.out.println("Hello, " + name + '!');
    }
    static void leapYear(int year){
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) System.out.println("Високосный");
        else  System.out.println("Не високосный");
    }


    static int[] randomArray(int arrSize){
        Random randomElement = new Random();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = randomElement.nextInt(100);
        }
        return arr;
    }
    static int[] bubleSort(int[] arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int buffer = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buffer;
                }
            }
        }
        return arr;
    }
}
