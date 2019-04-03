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

    }
    static int evaluateExpression(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    static boolean summInRrange_10_20(int a, int b){
        return a + b > 10 && a + b < 20;
    }
    static void positiveOrNegative(int number){
        if (number < 0) System.out.println("Negative");
        else System.out.println("Positive");
    }
    static void greeting(String name){
        System.out.println("Hello, " + name + '!');
    }
    static void leapYear(int year){
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) System.out.println("Високосный");
        else  System.out.println("Не високосный");
    }
}
