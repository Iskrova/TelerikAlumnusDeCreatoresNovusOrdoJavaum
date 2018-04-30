package Society;

import Tasks.Task;

public class Ninja extends Fellow implements HardTaskAssignable {

    public Ninja(String name) {
        super(name);
    }

    @Override
    public Task assignTask() {
        return null;
    }
}
