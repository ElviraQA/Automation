package animals;

import aviary.AviarySize;
import exception.WrongFoodException;
import food.*;

public abstract class Herbivores extends Animal{
    public Herbivores(String name, AviarySize aviarySize) {

        super(name, aviarySize);
    }

    @Override
    public void eat(Food food) throws  WrongFoodException {
        if (food instanceof Grass) {
            System.out.println("Животное наелось!");
            this.consume(food);
        } else {
            throw new WrongFoodException();
        }
    }
}
