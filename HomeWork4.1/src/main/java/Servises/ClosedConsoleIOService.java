package Servises;

import java.io.PrintStream;
import java.util.Scanner;

public class ClosedConsoleIOService implements IOService {
    private final PrintStream out;
    private final Scanner sc;


    public ClosedConsoleIOService() {
        this.out = System.out;
        this.sc = new Scanner(System.in);
    }

    public int in() {
        return sc.nextInt();
    }

    @Override
    public void out(String message) {
        out.println(message);
    }

    @Override
    public String readString() {
        return sc.nextLine();
    }
}

