package animals;

import aviary.AviarySize;

public class Crocodile extends Carnivores implements Run, Swim {
    public Crocodile(String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void run() {
        System.out.printf("%s бежит\n", name);
    }

    @Override
    public void swim() {
        System.out.printf("%s плавает\n", name);
    }
}
