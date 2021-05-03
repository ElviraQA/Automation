package animals;

import aviary.AviarySize;
import exception.WrongFoodException;
import food.*;

import java.util.Objects;

public abstract class Animal {

    protected int satiety;
    protected final String name;
    protected final AviarySize aviarySize;

    protected Animal(String name, AviarySize aviarySize) {
        this.name = name;
        this.aviarySize = aviarySize;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void eat(Food food) throws WrongFoodException;

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
