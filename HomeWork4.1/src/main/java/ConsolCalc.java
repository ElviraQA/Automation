import Servises.*;

import java.util.ArrayList;
import java.util.List;

public class ConsolCalc {
    private static void showMenu(List<UserAction> actions, IOService output) {
        output.out ("Menu.");
        for (int i = 0; i < actions.size(); i++) {
            output.out (i + ". " + actions.get(i).name());
        }
    }
    public static void main(String[] args) {
        IOService closedConsoleIOService = new ClosedConsoleIOService();
        IOService openedConsoleIOService = new OpenedConsoleIOService(new ConsoleContext());

        closedConsoleIOService.out("Привет!");
        System.out.println("Выберите действие:");
        CalculatorService calculatorService = new CalculatorServiceImpl(openedConsoleIOService);
        List<UserAction> actions = new ArrayList<>();
        actions.add(new Multiply(openedConsoleIOService, calculatorService));
        actions.add(new Divide(openedConsoleIOService, calculatorService));
        actions.add(new Add(openedConsoleIOService, calculatorService));
        actions.add(new Substract(openedConsoleIOService, calculatorService));

        showMenu(actions, closedConsoleIOService);
        int select = closedConsoleIOService.in();
        if (select < 0 || select >= actions.size()) {
            closedConsoleIOService.out("Неверно, выберите действие: 0 .. " + (actions.size() - 1));
        }
        actions.get(select).execute();

    }
}

