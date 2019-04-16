package lesson_6;

import java.util.Random;

import javax.sound.midi.Soundbank;

public class MainAnimal {
    public static void main(String[] args){

        Dog[] dogs = new Dog[10];
        Cat[] cats = new Cat[10];

        createCat(cats);
        createDog(dogs);

        cats[2].info();
        cats[2].run(500);
        cats[2].jump(5);
        System.out.println();
        dogs[5].info();
        dogs[5].swim(300);
        dogs[5].run(500);
        System.out.println();
        cats[6].swim(50);
        System.out.println();

        System.out.println(cats[6].getBreed());

        System.out.println(cats[5].getRunLim());
        cats[5].run(500);

        System.out.println(cats[6].getName());

}









    /**Заполнение массива cats элементами. */

public static void createCat(Cat[] cats){
    String[] petName = {"Зевс", "Лев", "Цезарь", "Черчиль","Элис", "Чарли", "Джонни", "Бонифаций", "Леопольд", "Майло"};
    String[] breedCat = {"Сиамская", "Сибирская", "Невская маскарадная", "Сингапурская" ,"Сноу-Шу", "Сококе", "Сомали" ,"Скоттиш фолд", "Серенгети", "Тойгер"};

    for (int i = 0; i <  cats.length; i++) {
        cats[i] = new Cat(rndCharacter(petName), rndCharacter(breedCat), rndParam(),rndJump());
        }
}

    /**Заполнение массива dogs элементами.*/

    public static void createDog(Dog[] dogs){
        String[] petName = {"Зевс", "Лев", "Цезарь", "Царь","Элис", "Чарли", "Джонни", "Бонифаций", "Леопольд", "Майло"};
        String[] breedDog = {"Дог", "Колли", "Бостон-терьер", "Брохольмер" ,"Бультерьер", "Бурбуль", "Бульмастиф" ,"Корги", "Маламут", "Джек-рассел"};

        for (int i = 0; i <  dogs.length; i++) {
            dogs[i] = new Dog(rndCharacter(petName), rndCharacter(breedDog), rndParam(), rndParam(), rndJump());
        }
    }

    /** Рандомизирование параметров. */

  static String rndCharacter(String[] characteristic){
    Random rnd = new Random();
    String character;
    int characterNum = rnd.nextInt(characteristic.length);
    return  character = characteristic[characterNum];
}

  static int rndParam(){
        Random rnd = new Random();
        int param = rnd.nextInt(999) + 100;
        return param;
  }

  static int rndJump(){
      Random rnd = new Random();
      int jump = rnd.nextInt(5) + 1;

      return  jump;
  }
}


