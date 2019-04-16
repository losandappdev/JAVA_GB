package lesson_6;

public class Dog extends Enimal {



    public Dog(String name, String breed, int runLim, int swimLim, int jumpLim) {
        super(name, breed, runLim, swimLim, jumpLim);
    }


    void voice() {
        System.out.println("Gav");
    }


//    void info() {
//        System.out.println("Имя:       " + name);
//        System.out.println("Порода:    " + breed );
//        System.out.println("Бежит на   " + runLim + " m");
//        System.out.println("Плывет на  " + swimLim + " m");
//        System.out.println("Прыгает на " + jumpLim + " m");
//    }


}
