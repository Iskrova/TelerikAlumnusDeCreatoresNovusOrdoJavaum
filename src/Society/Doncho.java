package Society;

import Tasks.Task;

public class Doncho implements HardAdvisor,HardTaskAssignable {
    private static Doncho ourInstance = new Doncho();

    public static Doncho getInstance() {
        return ourInstance;
    }

    private Doncho() {
    }

    @Override
    public void giveHardAdvice(Player player) {

    }

    @Override
    public Task assignTask() {

        return null;
    }
}
