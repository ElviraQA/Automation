package animals;

import aviary.AviarySize;

public class Sheep extends Herbivores implements Run, Voice {

    public Sheep(String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void run() {
        System.out.printf("%s бкжит\n", name);
    }

    @Override
    public String voice() {
        return "Бее";
    }
}
