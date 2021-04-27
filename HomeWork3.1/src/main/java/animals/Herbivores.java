package animals;

import aviary.AviarySize;
import exception.WrongFoodException;
import food.*;

public abstract class Herbivores extends Animal{
    public Herbivores(String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Grass) consume(food);
        else throw new WrongFoodException(this, food);
    }
}
