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

    public void addAnimal(T animal) {
        String animalName = animal.getName();
        if (animal.getAviarySize() != size)
            throw new IllegalArgumentException(String.format("Этот вольера размер не подходит для животного %s", animalName));
        if (map.containsKey(animalName))
            throw new IllegalArgumentException(String.format("Животное %s уже находится в вольере", animalName));
        else map.put(animalName, animal);
        System.out.printf("Животное %s добавленно в вольер\n", animalName);
    }

    public void removeAnimal(T animal) {
        removeAnimal(animal.getName());
    }

    public void removeAnimal(String animalName) {
        if (!map.containsKey(animalName))
            throw new IllegalArgumentException(String.format("Животного %s нет в вольере", animalName));
        else map.remove(animalName);
        System.out.printf("Животное %s исключено из вольера\n", animalName);
    }

    public T getAnimal(String animalName) {
        if (!map.containsKey(animalName))
            throw new IllegalArgumentException(String.format("Животного %s нет в вольере", animalName));
        else return map.get(animalName);
    }
}
