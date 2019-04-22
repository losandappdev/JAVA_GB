package Lesson_7;

import java.util.Random;

public class Plate {
    private int food;

    public void deacreaceFood(int n){
        food -= n;
    }
    public void addFood(){
        int addValue;
        Random rnd = new Random();
        addValue = rnd.nextInt(100) + 50;
        food += addValue;
    }

    public void info(){
        System.out.println(food);
    }

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
