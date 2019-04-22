package Lesson_7;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        Cat[] cats = new Cat[3];
        createCat(cats);
        cats[1].info();

//        System.out.println(cats[1].getName());
//        Cat cat = new Cat(50,"Vaska");
//        Plate plate = new Plate(100);
//        plate.info();
//        cat.eat(plate);
//        plate.info();
    }
public static void createCat(Cat[] cats){

    String[] nameCat = {"Vaska","Murzik","Rizhik"};
    for (int i = 0; i < cats.length ; i++) {
        cats[i] = new Cat(rndCatAppetit(i),nameCat[i] );
    }
}
public static int rndCatAppetit(int i){
    Random rnd = new Random();
    int appettit = rnd.nextInt(90) + 10;
    return appettit;
}

}
