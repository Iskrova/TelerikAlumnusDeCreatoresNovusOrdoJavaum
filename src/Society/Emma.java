package Society;

import PlayerProperties.Skill;
import Tasks.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Emma extends Fellow implements SoftTaskAssignable, SoftAdvisor {
    private static Emma ourInstance = new Emma();

    public static Emma getInstance() {
        return ourInstance;
    }

    public Emma() {
        super("Emma");
    }

    @Override
    public Task assignTask() {
        int pool = getTasks().size();
        if(pool == 0){
            generateTaks();
            pool = getTasks().size();
        }
        int task = Coder.getRNG().nextInt(pool);
        return getTasks().remove(task);
    }

    @Override
    public void giveSoftAdvice(Player player) throws NoCurrentTaskException {
        if(player.getCurrentTask() == null) {
            throw new NoCurrentTaskException("You need to have an active task for me to give you advice on");
        }
        int softSkill = Coder.getRNG().nextInt(11) + 5;
        Skill s = new Skill(0, softSkill, 0);
        player.getSkills().gainSkill(s);
        player.updateTask(s, 1);
    }

    @Override
    public void generateTaks() {
        Map<String, List<Task>> map = Coder.getAllTasks();
        List<Task> presi = map.get("Presentation");
        List<Task> docs = map.get("Documentation");
        for (int i = 0; i < 3; i++){
            int presiTask = Coder.getRNG().nextInt(presi.size());
            int docsTask = Coder.getRNG().nextInt(docs.size());

            getTasks().add(presi.get(presiTask));
            getTasks().add(docs.get(docsTask));
        }
    }

    @Override
    public String toString() {
        return "Emma";
    }
}
