package Society;

import Tasks.Task;

public class ProjectManager extends MasterCoder implements HardTaskAssignable,HardAdvisor {
    public ProjectManager(String name) {
        super(name);
    }

    @Override
    public Task assignTask() {
        return null;
    }

    @Override
    public void giveHardAdvice(Player player) {

    }
}
