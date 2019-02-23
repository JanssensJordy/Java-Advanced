package app;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Vrouw karen = new Vrouw("Karen", LocalDate.of(1999,8,27));
        VrouwTest.testVrouw(karen);
        System.out.println();
        Vrouw dominique = new Vrouw("Dominique", LocalDate.of(1995, 1, 15));
        VrouwTest.testVrouw(dominique);
    }
}