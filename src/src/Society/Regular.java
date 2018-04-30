package Society;

import Tasks.Task;

public  class Regular extends Entered  implements HardTaskAssignable{

    public Regular(String name) {
        super(name);
    }


    @Override
    public Task assignTask() {
        return null;
    }
}
