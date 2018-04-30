package Society;

import Tasks.Task;

public class Emma implements SoftTaskAssignable, SoftAdvisor {
    private static Emma ourInstance = new Emma();

    public static Emma getInstance() {
        return ourInstance;
    }

    private Emma() {
    }

    @Override
    public Task assignTask() {
        return null;
    }

    @Override
    public void giveSoftAdvice(Player player) {

    }
}
