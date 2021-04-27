import Animal.Animal;
import Animal.Voice;
import Food.Food;

public abstract class Worker {
    public static void feed(Animal animal, Food food){
        animal.eat(food);
    }

    public static String getVoice(Voice animal){
        return animal.voice();
    }
}