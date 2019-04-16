package lesson_6;

public class Dog extends Enimal {



    public Dog(String name, String breed, int runLim, int swimLim, int jumpLim) {
        super(name, breed, runLim, swimLim, jumpLim);
    }


    void voice() {
        System.out.println("Gav");
    }
}
