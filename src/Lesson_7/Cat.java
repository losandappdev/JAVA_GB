package Lesson_7;

public class Cat {
    private int appetit;
    private String name;

    public void eat(Plate p){
        p.deacreaceFood(appetit);
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

    public int getAppetit() {
        return appetit;
    }

    public String getName() {
        return name;
    }
}
