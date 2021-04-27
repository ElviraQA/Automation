import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    public static void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public static String getVoice(Voice animal) {
        return animal.voice();
    }
}
