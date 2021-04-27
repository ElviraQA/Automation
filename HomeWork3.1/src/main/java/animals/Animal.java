package animals;

import aviary.AviarySize;
import food.*;

public abstract class Animal {

    protected int satiety;
    protected final String name;
    protected final AviarySize aviarySize;

    protected Animal(String name, AviarySize aviarySize) {
        this.name = name;
        this.aviarySize = aviarySize;
    }

    public abstract void eat(Food food);

    public AviarySize getAviarySize() {
        return aviarySize;
    }

    public String getName() {
        return name;
    }

    protected void consume(Food food) {
        int feedRate = food.getFeedRate();
        satiety += feedRate;
        System.out.printf("%s покормили %s и оно востановило %d голода\n", name, food.getName(), feedRate);
    }
}
