package Animal;

public class Fish extends Herbivorus implements Swim {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("%s плавает\n", name);
    }

}
