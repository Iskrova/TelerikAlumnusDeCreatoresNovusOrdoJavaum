package Society;

import Tasks.Documentation;
import Tasks.Persentation;

public class CTO extends MasterCoder {

    public CTO(String name) {

        super(name);
    }

    @Override
    public void generateTaks() {
        getTasks().add(new Documentation());
        getTasks().add(new Persentation());
        getTasks().add(new Persentation());
    }

    public void talkTo(Player p){
        p.stressOut(10);
    }

}
