package Society;

import PlayerProperties.Skill;
import Tasks.*;

public class Emma extends Fellow implements SoftTaskAssignable, SoftAdvisor {
    private static Emma ourInstance = new Emma();

    public static Emma getInstance() {
        return ourInstance;
    }

    private Emma() {
        super("Emma");
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
    public void giveSoftAdvice(Player player) {
        int softSkill = Coder.getRNG().nextInt(11) + 5;
        Skill s = new Skill(0, softSkill, 0);
        player.getSkills().gainSkill(s);
        player.updateTask(s, 1);
    }

    @Override
    public void generateTaks() {
        for (int i = 0; i < 5; i++){
            getTasks().add(new Presentation());
            getTasks().add(new Documentation());
        }
    }
}
