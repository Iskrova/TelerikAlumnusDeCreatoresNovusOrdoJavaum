package Society;

import PlayerProperties.Skill;
import Tasks.Documentation;
import Tasks.Persentation;
import Tasks.Task;

public class TeamLeader extends MasterCoder implements SoftAdvisor, SoftTaskAssignable {
    public TeamLeader(String name) {

        super(name);
    }

    @Override
    public void giveSoftAdvice(Player player) {
        int softSkill = Coder.getRNG().nextInt(11) + 7;
        Skill s = new Skill(0, softSkill, 0);
        player.getSkills().gainSkill(s);
        player.updateTask(s, 1);
    }

    @Override
    public Task assignTask() {
        int pool = getTasks().size();
        if(pool == 0){
            return null;
        }
        int task = Coder.getRNG().nextInt(pool);
        return getTasks().remove(task);
    }

    @Override
    public void generateTaks() {
        for(int i = 0; i < 5; i++){
            getTasks().add(new Persentation());
            getTasks().add(new Documentation());
        }

    }
}
