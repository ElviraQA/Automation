package Animal;

public class Crocodile extends Carnivoures implements Run, Swim {
    public Crocodile(String name) {
        super(name);
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
