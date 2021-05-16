import Servises.CalculatorService;
import Servises.IOService;

public class Multiply implements UserAction {
    private final IOService output;
    private final CalculatorService calc;

    public Multiply(IOService output, CalculatorService calc) {
        this.output = output;
        this.calc = calc;
    }

    @Override
    public String name() {
        return "Multiply";
    }

    @Override
    public void execute() {
        calc.readTwoDigitsAndMultiply("Введите два числа и мы их перемножим!");
        output.out("---------------------------------------------------------");
        System.out.println("Мы перемножили два числа!");
    }
}
