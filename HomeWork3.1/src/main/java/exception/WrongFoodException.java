package exception;

import animals.Animal;
import food.Food;

public class WrongFoodException extends RuntimeException {
    public WrongFoodException(Animal animal, Food food) {
        super(String.format("Еда %s не подходит для животного %s", food.getName(), animal.getName()));
    }
}
