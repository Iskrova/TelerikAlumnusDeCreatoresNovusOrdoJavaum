package StartPlay;

import Society.*;
import Tasks.Algo;

public class Start {
    public static void main(String[] args) {
        Player coki = new Player("Coki");
        Doncho Minkov = new Doncho();
        Emma ema = new Emma();
        CTO Boyko = new CTO("Boyko");
        Ninja Cuki = new Ninja("Cuki");



        coki.receiveTask(Minkov.assignTask());
        coki.getHardAdvice(Minkov);

        coki.receiveTask(ema.assignTask());
        coki.getSoftAdvice(ema);

        coki.rest(3,4);
        coki.relieveStres(10);

        coki.receiveTask(Boyko.assignTask());
        coki.getHardAdvice(Minkov);

        coki.receiveTask(Cuki.assignTask());
        coki.getHardAdvice(Minkov);
        coki.relieveStres(50);
        coki.tireOut(50);
        coki.rest(12,5);
    }
}
