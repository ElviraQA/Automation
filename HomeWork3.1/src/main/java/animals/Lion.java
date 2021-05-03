package animals;

import aviary.AviarySize;

public class Lion extends Carnivores implements Run, Voice {
    public Lion(String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void run() {
        System.out.printf("%s бежит\n", name);
    }

    @Override
    public String voice() {
        return "Грр";
    }
}
