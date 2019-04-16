package lesson_6;

public  class Cat extends Enimal {



    public Cat(String name, String breed, int runLim, int jumpLim) {
        super(name, breed, runLim, jumpLim);
    }

//
//        public void run ( int runLim){
//        System.out.println(this.runLim > runLim);
//    }
//
//        public void setName (String name){
//        this.name = name;
//    }
//
//        public void setBreed (String breed){
//        this.breed = breed;
//    }
//
//        public void setRunLim ( int runLim){
//        this.runLim = runLim;
//    }
//
//        public void setSwimLim ( int swimLim){
//        this.swimLim = swimLim;
//    }
//
//        public void setJumpLim ( int jumpLim){
//        this.jumpLim = jumpLim;
//    }
//
//        public String getName () {
//        return name;
//    }
//
//        public String getBreed () {
//        return breed;
//    }
//
//        public int getRunLim () {
//        return runLim;
//    }
//
//        public int getSwimLim () {
//        return swimLim;
//    }
//
//        public int getJumpLim () {
//        return jumpLim;
//    }


    void voice() {
        System.out.println("Meow");
    }




}
