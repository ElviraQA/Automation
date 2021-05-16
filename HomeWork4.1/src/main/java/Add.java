import Servises.CalculatorService;
import Servises.IOService;

public class Add implements UserAction {
    private final IOService output;
    private final CalculatorService calc;

    public Add(IOService output, CalculatorService calc) {
        this.output = output;
        this.calc = calc;
    }

    @Override
    public String name() {
        return "Add";
    }

    @Override
    public void execute() {
        calc.readTwoDigitsAndAdd("Введите два числа и мы их сложим!");
        output.out("---------------------------------------------------------");
        System.out.println("Мы сложили два числа!");
    }
}
