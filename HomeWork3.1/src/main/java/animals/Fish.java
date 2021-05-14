package animals;

import aviary.AviarySize;

public class Fish extends Herbivores implements Swim {
    public Fish(String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void swim() {
        System.out.printf("%s плавает\n", name);
    }

}
