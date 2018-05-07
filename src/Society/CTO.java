package Society;

import Tasks.Documentation;
import Tasks.Presentation;
import Tasks.Task;
import Tasks.TaskGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CTO extends MasterCoder implements SoftTaskAssignable {

    public CTO(String name) {

        super(name);
    }

    @Override
    public void generateTaks() {
        Map<String, List<Task>> map = Coder.getAllTasks();
        List<Task> tasks = map.get("Presentation");

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
            generateTaks();
            pool = getTasks().size();
        }
        int task = Coder.getRNG().nextInt(pool);
        return getTasks().remove(task);

    }
}
