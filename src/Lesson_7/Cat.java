package Lesson_7;

public class Cat {
    private int appetit;
    private String name;
    private boolean isFull = false;

    public void eat(Plate p){
        p.deacreaceFood(appetit);
    }
    public void info(){
        System.out.println("Cat " + name + " eats " + appetit + " g. of feed. Cat is full: " + isFull);
    }

    public Cat(int appetit, String name) {
        this.appetit = appetit;
        this.name = name;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }

    public int getAppetit() {
        return appetit;
    }

    public String getName() {
        return name;
    }

    public boolean getisFull() {
        return isFull;
    }
}
