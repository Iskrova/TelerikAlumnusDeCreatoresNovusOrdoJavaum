package Society;

import PlayerProperties.Skill;
import Tasks.Persentation;
import Tasks.OOP;
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
        int coding = Coder.getRNG().nextInt(11) + 7;
        player.stressOut(3);
        Skill s = new Skill(coding, 0, 0);
        player.getSkills().gainSkill(s);
        player.updateTask(s);
    }

    @Override
    public void generateTaks() {
        for(int i = 0; i < 5; i++){
            getTasks().add(new Persentation());
            getTasks().add(new OOP());
        }

    }
}
