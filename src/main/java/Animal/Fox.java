package Animal;

public class Fox extends Carnivoures implements Voice, Run {
    public Fox(String name) {
        super(name);
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
