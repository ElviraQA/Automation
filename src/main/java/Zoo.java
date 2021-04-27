import Animal.*;
import Food.Grass;
import Food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Овца обыкновенная");
        Duck duck = new Duck("Селезень зеленый");
        Fish fish = new Fish("Золотая рыбка");
        Fox fox = new Fox("Лисица обычная");
        Lion lion = new Lion("Лев обычный");
        Crocodile crocodile = new Crocodile("Крокодил обыкновенный");

        Meat meat = new Meat(10, "Мясо");
        Grass grass = new Grass(5, "Трава");

        Worker.feed(sheep, grass);
        Worker.feed(sheep, meat);
        System.out.println(Worker.getVoice(sheep));

        Worker.feed(fox, grass);
        Worker.feed(fox, meat);
        System.out.println(Worker.getVoice(fox));

        Swim[] lake = {crocodile, fish, duck};
        for (Swim animal : lake) {
            animal.swim();
        }

    }
}
