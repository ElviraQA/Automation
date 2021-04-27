package Animal;

public class Sheep extends Herbivorus implements Run, Voice {
    public Sheep(String name) {
        super(name);
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
