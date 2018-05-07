package Society;

import Tasks.Algo;
import Tasks.Task;
import Tasks.TaskGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public  class Regular extends Entered  implements HardTaskAssignable{

    public Regular(String name) {
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
    public void generateTaks() {
        Map<String, List<Task>> map = Coder.getAllTasks();
        List<Task> algo = map.get("Algo");
        for (int i = 0; i < 3; i++) {
            int algoTask = Coder.getRNG().nextInt(algo.size());
            getTasks().add(algo.get(algoTask));
        }
    }


}
