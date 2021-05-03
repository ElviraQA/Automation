package animals;

import aviary.AviarySize;

public class Duck extends Herbivores implements Swim, Run, Voice, Fly {
    public Duck(String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void run() {
        System.out.printf("%s бежит\n", name);
    }

    @Override
    public void swim() {
        System.out.printf("%s плывет\n", name);
    }

    @Override
    public String voice() {
        return "Кря";
    }

    @Override
    public void fly() {
        System.out.printf("%s взлетает", name);
    }
}
