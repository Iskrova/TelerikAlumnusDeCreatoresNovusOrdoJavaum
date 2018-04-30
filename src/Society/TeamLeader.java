package Society;

import Tasks.Task;

public class TeamLeader extends MasterCoder implements SoftAdvisor, SoftTaskAssignable {
    public TeamLeader(String name) {
        super(name);
    }

    @Override
    public void giveSoftAdvice(Player player) {

    }

    @Override
    public Task assignTask() {
        return null;
    }
}
