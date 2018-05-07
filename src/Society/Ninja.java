package Society;

import Tasks.Algo;
import Tasks.Task;
import Tasks.TaskGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ninja extends Fellow implements HardTaskAssignable {

    public Ninja(String name) {

        super(name);
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
        Map<String, List<Task>> map = Coder.getAllTasks();
        List<Task> algo = map.get("Algo");
        for(int i = 0; i < 5; i++){

            int algoTask = Coder.getRNG().nextInt(algo.size());
            getTasks().add(algo.get(algoTask));
        }
    }
}
