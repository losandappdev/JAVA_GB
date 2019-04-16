package lesson_6;

public  class Enimal {

    protected String name;
    protected String breed;
    protected int runLim;
    protected int swimLim;
    protected int jumpLim;

    public Enimal() {

    }

    /** Kрнструкторы */
    public Enimal(String name, String breed, int runLim, int swimLim, int jumpLim) {
        this.name = name;
        this.breed = breed;
        this.runLim = runLim;
        this.swimLim = swimLim;
        this.jumpLim = jumpLim;
    }

    public Enimal(String name, String breed, int runLim, int jumpLim) {
        this.name = name;
        this.breed = breed;
        this.runLim = runLim;
        this.jumpLim = jumpLim;
    }


    /** Методы : бежать, плыть, прыгать. */
    public void run(int runLim) {
        System.out.println(this.runLim > runLim);
    }

    public void swim(int swimLim) {
        System.out.println(this.swimLim > swimLim);
    }

    public void jump(int jumpLim) {
        System.out.println(this.jumpLim > jumpLim);
    }
    /** Вывод информации*/
    void info() {
        System.out.println("Имя:       " + name);
        System.out.println("Порода:    " + breed );
        System.out.println("Бежит на   " + runLim + " m");
        System.out.println("Плывет на  " + swimLim + " m");
        System.out.println("Прыгает на " + jumpLim + " m");
    }

    /** Геттеры сеттры */
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getRunLim() {
        return runLim;
    }

    public int getSwimLim() {
        return swimLim;
    }

    public int getJumpLim() {
        return jumpLim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setRunLim(int runLim) {
        this.runLim = runLim;
    }

    public void setSwimLim(int swimLim) {
        this.swimLim = swimLim;
    }

    public void setJumpLim(int jumpLim) {
        this.jumpLim = jumpLim;
    }
}
