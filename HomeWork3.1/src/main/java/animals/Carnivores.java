package animals;

import aviary.AviarySize;
import exception.WrongFoodException;
import food.Food;
import food.Meat;

import java.util.Objects;

public abstract class Carnivores extends Animal {
    protected Carnivores(String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void eat(Food food) throws  WrongFoodException {
        if (food instanceof Meat) {
            System.out.println("Животное наелось!");
            this.consume(food);
        } else {
            throw new WrongFoodException();
        }
    }
}
