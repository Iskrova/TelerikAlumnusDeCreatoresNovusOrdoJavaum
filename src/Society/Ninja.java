package Society;

import Tasks.Algo;
import Tasks.Task;

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
        for(int i = 0; i < 10; i++){
            getTasks().add(new Algo());
        }
    }
}
