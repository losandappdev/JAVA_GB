package Lesson_7;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat(50,"Vaska");
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
    }


}
