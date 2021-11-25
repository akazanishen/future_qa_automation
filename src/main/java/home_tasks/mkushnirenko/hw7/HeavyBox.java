package home_tasks.mkushnirenko.hw7;

public class HeavyBox {

    private double weight;

    public HeavyBox(double weight){
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    //в) Изменить вес первого ящика на 1.
    public void increaseWeightByOne(){
        this.weight++;
    }
}