package animals;

import aviary.AviarySize;

public class Fox extends Carnivores implements Voice, Run {
    public Fox(String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void run() {
        System.out.printf("%s бежит\n", name);
    }

    @Override
    public String voice() {
        return "Урчание лисы\n";
    }
}
