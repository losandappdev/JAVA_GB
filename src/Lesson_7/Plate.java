package Lesson_7;

import javax.sound.midi.Soundbank;

public class Plate {
    private int food;

    public void deacreaceFood(int n){
        food -= n;
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
