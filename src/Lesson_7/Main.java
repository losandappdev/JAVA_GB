package Lesson_7;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        Cat[] cats = new Cat[3];
        createCat(cats);
//        cats[1].info();
        Plate plate = new Plate(randomizator(50));
        System.out.print("In the plate: ");
        plate.info();
//        feedingCats(cats, plate);
        feedingCatsFull(cats, plate);


//        System.out.println(cats[1].getName());
//        Cat cat = new Cat(50,"Vaska");

//        plate.info();
//        cat.eat(plate);
//        plate.info();
    }
    /** Задает массив котов. */
public static void createCat(Cat[] cats){

    String[] nameCat = {"Vaska","Murzik","Rizhik"};
    for (int i = 0; i < cats.length ; i++) {
        cats[i] = new Cat(randomizator(10),nameCat[i] );
    }
}
/** Выдает рандомные значения от указанного минимума в с диапозоном 100. */
public static int randomizator(int from){
    Random rnd = new Random();
    int appettit = rnd.nextInt(100) + from;
    return appettit;
}
/** Кормит всех котов. */
public static void feedingCats(Cat[] cats, Plate plate){

    for (int i = 0; i < cats.length; i++) {
        if (cats[i].getAppetit() <= plate.getFood() && cats[i].getisFull() == false) {
            cats[i].eat(plate);
            cats[i].setFull(true);
        }
        cats[i].info();
//        System.out.print("In plate: ");
//        plate.info();
    }
    System.out.print("In plate: ");
    plate.info();
}
/** Проверяет все ли коты сыты. */
public static boolean needFood(Cat[] cats, Plate plate){
    for (int i = 0; i < cats.length; i++) {
        if (!cats[i].getisFull()) {
            System.out.print("Add food to the plate. Have a ");
            plate.info();
            return true;
            }

    }
    return false;
}
/** Кормит котов, добавляя корм до тех пор пока все не будут сыты*/
public static void feedingCatsFull(Cat[] cats, Plate plate) {

         do {
            feedingCats(cats, plate);
            plate.addFood();
         }while (needFood(cats,plate));


    }

}
