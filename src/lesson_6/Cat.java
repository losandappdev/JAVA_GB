package lesson_6;

  class Cat extends Enimal {



    Cat(String name, String breed, int runLim, int jumpLim) {
        super(name, breed, runLim, jumpLim);
    }

    void voice() {
        System.out.println("Meow");
    }
}
