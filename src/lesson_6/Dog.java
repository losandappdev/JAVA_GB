package lesson_6;

 class Dog extends Enimal {

     private Dog(String name, String breed, int runLim, int swimLim, int jumpLim) {
        super(name, breed, runLim, swimLim, jumpLim);
    }

    void voice() {
        System.out.println("Gav");
    }
}
