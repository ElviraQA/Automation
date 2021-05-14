package aviary;

import animals.Animal;
import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {
    private final AviarySize size;
    private final Map<String, T> map = new HashMap<>();

    public Aviary(AviarySize size) {
        this.size = size;
    }

    public AviarySize getAviarySize() {
        return size;
    }

    public void addAnimal(T animal) {
        String animalName = animal.getName();
        if (animal.getAviarySize().getIntSize() > size.getIntSize())
            System.out.printf("Вольер размера %s не подходит для животного %s размера %s\n", this.getAviarySize(), animalName, animal.getAviarySize());
        if (map.containsKey(animalName))
            System.out.printf("Такое животное %s уже есть в вольере\n", animalName);
        else {map.put(animalName, animal);
        System.out.printf("Животное %s добавленно в вольер\n", animalName);}
    }

    public void removeAnimal(T animal) {
        removeAnimal(animal.getName());
    }

    public void removeAnimal(String animalName) {
        if (!map.containsKey(animalName))
            System.out.printf("Такого животного %s нет в вольере\n", animalName);
        else {
            map.remove(animalName);
            System.out.printf("Животное %s исключено из вольера\n", animalName);
        }
    }

    public T getAnimal(String animalName) {
        if (!map.containsKey(animalName)) {
            return null;
        } else {
            return map.get(animalName);
        }
    }
}
