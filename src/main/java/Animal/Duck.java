package Animal;

public class Duck extends Herbivorus implements Swim, Run, Voice {
    public Duck(String name) {
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

    @Override
    public String voice() {
        return "Кря";
    }
}
