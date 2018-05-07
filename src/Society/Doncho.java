package Society;

import PlayerProperties.Skill;
import Tasks.Algo;
import Tasks.OOP;
import Tasks.Task;
import Tasks.TaskGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Doncho extends Fellow implements HardAdvisor, HardTaskAssignable {
    private static Doncho ourInstance = new Doncho();

    public static Doncho getInstance() {
        return ourInstance;
    }

    private Doncho() {
        super("Doncho");
    }

    @Override
    public void giveHardAdvice(Player player) {
        int codingSkill = Coder.getRNG().nextInt(11) + 5;
        int algoThinking = Coder.getRNG().nextInt(11) + 5;
        Skill s = new Skill(codingSkill, 0, algoThinking);
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
        List<Task> oop = map.get("OOP");
        List<Task> algo = map.get("Algo");
        for(int i = 0; i < 5; i++){

            int oopTask = Coder.getRNG().nextInt(oop.size());
            int algoTask = Coder.getRNG().nextInt(algo.size());

            getTasks().add(oop.get(oopTask));
            getTasks().add(algo.get(algoTask));
        }
    }
}
