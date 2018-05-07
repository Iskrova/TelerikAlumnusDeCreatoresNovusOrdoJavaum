package Society;

import PlayerProperties.Skill;
import Tasks.Documentation;
import Tasks.Presentation;
import Tasks.Task;
import Tasks.TaskGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        Map<String, ArrayList<Task>> map = TaskGenerator.Generator.generateAllTasksTypes();
        List<Task> presi = map.get("Presentation");
        List<Task> docs = map.get("Documentation");
        for (int i = 0; i < 3; i++) {
            int presiTask = Coder.getRNG().nextInt(presi.size());
            int docsTask = Coder.getRNG().nextInt(docs.size());

            getTasks().add(presi.get(presiTask));
            getTasks().add(docs.get(docsTask));
        }

    }
}
