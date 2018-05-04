package Society;

import Tasks.Algo;
import Tasks.Task;

public  class Regular extends Entered  implements HardTaskAssignable{

    public Regular(String name) {
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
        for(int i = 0; i < 5; i++){
            this.getTasks().add(new Algo());
        }
    }


}
