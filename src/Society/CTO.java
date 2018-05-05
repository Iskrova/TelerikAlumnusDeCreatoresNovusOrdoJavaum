package Society;

import Tasks.Documentation;
import Tasks.Presentation;

public class CTO extends MasterCoder {

    public CTO(String name) {

        super(name);
    }

    @Override
    public void generateTaks() {
        getTasks().add(new Documentation());
        getTasks().add(new Presentation());
        getTasks().add(new Presentation());
    }

    public void talkTo(Player p){
        p.stressOut(10);
    }

}
