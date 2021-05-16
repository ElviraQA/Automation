package Servises;

import java.lang.Math;

public class CalculatorServiceImpl implements CalculatorService {
    private final IOService ioService;

    public CalculatorServiceImpl(IOService ioService) {
        this.ioService = ioService;
    }

    @Override
    public void readTwoDigitsAndMultiply() {
        int d1 = Integer.parseInt(ioService.readString());
        int d2 = Integer.parseInt(ioService.readString());
        multiplyAndOutResult(d1, d2);
    }

    @Override
    public void readTwoDigitsAndMultiply(String prompt) {
        ioService.out(prompt);
        readTwoDigitsAndMultiply();
    }

    @Override
    public void longCalculations() {
        ioService.out("Ответ на главный вопрос жизни, вселенной и всего такого");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ioService.out("<<42>>");
    }

    @Override
    public void readTwoDigitsAndDivide() {
        int d1 = Integer.parseInt(ioService.readString());
        int d2 = Integer.parseInt(ioService.readString());
        divideAndOutResult(d1, d2);
    }

    @Override
    public void readTwoDigitsAndDivide(String prompt) {
        ioService.out(prompt);
        readTwoDigitsAndDivide();
    }

    @Override
    public void readTwoDigitsAndAdd() {
        int d1 = Integer.parseInt(ioService.readString());
        int d2 = Integer.parseInt(ioService.readString());
        addAndOutResult(d1, d2);
    }

    @Override
    public void readTwoDigitsAndAdd(String prompt) {
        ioService.out(prompt);
        readTwoDigitsAndAdd();
    }

    @Override
    public void readTwoDigitsAndSubtract() {
        int d1 = Integer.parseInt(ioService.readString());
        int d2 = Integer.parseInt(ioService.readString());
        subtractAndOutResult(d1, d2);
    }

    @Override
    public void readTwoDigitsAndSubtract(String prompt) {
        ioService.out(prompt);
        readTwoDigitsAndSubtract();
    }

    public int multiplyAndOutResult(int d1, int d2) {
        int result = Math.multiplyExact(d1, d2);
        ioService.out(String.format("%d * %d = %d", d1, d2, result));
        return result;
    }

    public int divideAndOutResult(int d1, int d2) {
        int result = d1 / d2;
        ioService.out(String.format("%d / %d = %d", d1, d2, result));
        return result;
    }

    public int addAndOutResult(int d1, int d2) {
        int result = Math.addExact(d1, d2);
        ioService.out(String.format("%d + %d = %d", d1, d2, result));
        return result;
    }

    public int subtractAndOutResult(int d1, int d2) {
        int result = Math.subtractExact(d1, d2);
        ioService.out(String.format("%d - %d = %d", d1, d2, result));
        return result;
    }
}

