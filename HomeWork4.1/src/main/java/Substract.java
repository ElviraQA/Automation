import Servises.CalculatorService;
import Servises.IOService;

public class Substract implements UserAction {
        private final IOService output;
        private final CalculatorService calc;

        public Substract(IOService output, CalculatorService calc) {
                this.output = output;
                this.calc = calc;
            }

        @Override
        public String name() {
        return "Substract";
    }

        @Override
        public void execute() {
            calc.readTwoDigitsAndSubtract("Введите два числа и мы их вычтем!");
            output.out("---------------------------------------------------------");
            System.out.println("Мы вычли два числа!");
        }
}
