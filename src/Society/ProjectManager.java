package Society;

import PlayerProperties.Skill;
import Tasks.Presentation;
import Tasks.OOP;
import Tasks.Task;
import Tasks.TaskGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProjectManager extends MasterCoder implements HardTaskAssignable,HardAdvisor {
    
    public ProjectManager(String name) {

        super(name);
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
    public void giveHardAdvice(Player player) throws NoCurrentTaskException {
        int coding = Coder.getRNG().nextInt(11) + 7;
        player.stressOut(3);
        Skill s = new Skill(coding, 0, 0);
        player.getSkills().gainSkill(s);
        player.updateTask(s, 1);
    }

    @Override
    public void generateTaks() {
        Map<String, List<Task>> map = Coder.getAllTasks();
        List<Task> oop = map.get("OOP");
        List<Task> docs = map.get("Documentation");
        for (int i = 0; i < 3; i++) {
            int oopTask = Coder.getRNG().nextInt(oop.size());
            int docsTask = Coder.getRNG().nextInt(docs.size());

            getTasks().add(oop.get(oopTask));
            getTasks().add(docs.get(docsTask));
        }
    }
}
