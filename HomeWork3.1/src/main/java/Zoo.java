import animals.*;
import aviary.Aviary;
import aviary.AviarySize;
import exception.WrongFoodException;
import food.*;

public class Zoo {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Овца обыкновенная", AviarySize.SMALL);
        Duck duck = new Duck("Селезень зеленый", AviarySize.SMALL);
        Fish fish = new Fish("Золотая рыбка", AviarySize.MEDIUM);
        Fox fox = new Fox("Лисица обычная", AviarySize.MEDIUM);
        Lion lion = new Lion("Лев обычный", AviarySize.BIG);
        Lion lion2 = new Lion("Львица обычная", AviarySize.BIG);
        Crocodile crocodile = new Crocodile("Крокодил обыкновенный", AviarySize.LARGE);

        Aviary<Herbivores> grassEatingAviary = new Aviary<>(AviarySize.SMALL);

        Aviary<Carnivores> meatEatingAviary = new Aviary<>(AviarySize.BIG);

        Meat meat = new Meat(10, "Мясо");
        Grass grass = new Grass(5, "Трава");

        try {
            Worker.feed(sheep, grass);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }
        try {
            Worker.feed(sheep, meat);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Worker.getVoice(sheep));

        try {
            Worker.feed(fox, grass);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }

        try {
            Worker.feed(fox, meat);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Worker.getVoice(fox));

        lion.run();

        Swim[] lake = {crocodile, fish, duck};
        for (Swim animal : lake) {
            animal.swim();
        }

        grassEatingAviary.addAnimal(sheep);
        grassEatingAviary.addAnimal(duck);
//      grassEatingAviary.removeAnimal(sheep);
        meatEatingAviary.addAnimal(fox);
        grassEatingAviary.addAnimal(fish);
        grassEatingAviary.removeAnimal("Dummy");
        meatEatingAviary.addAnimal(lion);
        meatEatingAviary.removeAnimal(lion);

        if (grassEatingAviary.getAnimal("Овца обыкновенная") != null)
            System.out.println(grassEatingAviary.getAnimal("Овца обыкновенная").getName() + " есть в вольере");
        else
            System.out.println("Овца обыкновенная нет в вольере");

        if (grassEatingAviary.getAnimal("Лев обычный") != null)
            System.out.println(grassEatingAviary.getAnimal("Овца обыкновенная").getName() + " есть в вольере\n");
        else
            System.out.println("Лев обычный нет в вольере");
    }
}
