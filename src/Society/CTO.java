package Society;

import Tasks.Documentation;
import Tasks.Presentation;
import Tasks.Task;
import Tasks.TaskGenerator;

import java.util.ArrayList;
import java.util.Map;

public class CTO extends MasterCoder implements SoftTaskAssignable {

    public CTO(String name) {

        super(name);
    }

    @Override
    public void generateTaks() {
        Map<String, ArrayList<Task>> map = TaskGenerator.Generator.generateAllTasksTypes();
        ArrayList<Task> tasks = map.get("Presentation");

        getTasks().add((tasks.get(Coder.getRNG().nextInt(tasks.size()))));
        getTasks().add((tasks.get(Coder.getRNG().nextInt(tasks.size()))));
        getTasks().add((tasks.get(Coder.getRNG().nextInt(tasks.size()))));
    }

    public void talkTo(Player p){
        p.stressOut(10);
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
}
