package Animal;

public class Lion extends Carnivoures implements Run, Voice {
    public Lion(String name) {
        super(name);
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
