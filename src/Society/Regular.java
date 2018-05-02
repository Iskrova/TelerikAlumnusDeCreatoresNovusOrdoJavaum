package Society;

import Tasks.Algo;
import Tasks.Task;

public  class Regular extends Entered  implements HardTaskAssignable{

    public Regular(String name) {
        super(name);
    }


    @Override
    public Task assignTask() {
        int taskPool = this.getTasks().size();
        if(taskPool == 0){
            return null;
        }
        int task = Coder.getRNG().nextInt(taskPool);
        return  this.getTasks().get(task);
    }

    @Override
    public void generateTaks() {
        for(int i = 0; i < 5; i++){
            this.getTasks().add(new Algo());
        }
    }


}
