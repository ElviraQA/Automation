import Servises.CalculatorService;
import Servises.IOService;

public class Divide implements UserAction {
    private final IOService output;
    private final CalculatorService calc;

    public Divide (IOService output, CalculatorService calc) {
        this.output = output;
        this.calc = calc;
    }

    @Override
    public String name() {
        return "Divide";
    }

    @Override
    public void execute() {
        calc.readTwoDigitsAndDivide("Введите два числа и мы их разделим!");
        output.out("---------------------------------------------------------");
        System.out.println("Мы разделили два числа!");
    }
}
