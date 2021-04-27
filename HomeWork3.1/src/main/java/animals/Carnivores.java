package animals;

import aviary.AviarySize;
import exception.WrongFoodException;
import food.Food;
import food.Meat;

public abstract class Carnivores extends Animal {
    protected Carnivores(String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) consume(food);
        else throw new WrongFoodException(this, food);
    }
}
