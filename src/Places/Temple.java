package Places;

import PlayerProperties.Skill;
import Society.Coder;
import Society.NoCurrentTaskException;
import Society.Player;

public class Temple implements Trainable, Locatable {
    private  String location = "Oracle Corporation\n" +
                               "500 Oracle Parkway\n" +
                               "Redwood Shores, CA 94065";

    @Override
    public void train(Player player) throws NoCurrentTaskException {

        player.relieveStres(13);
        int coding = Coder.getRNG().nextInt(61)+40;
        int soft = Coder.getRNG().nextInt(61)+20;
        int algo = Coder.getRNG().nextInt(61)+20;
        Skill s = new Skill(coding, soft, algo);
        player.getSkills().gainSkill(s);
        if(player.getCurrentTask() != null){
            player.getCurrentTask().getRequirements().reduceSkill(s);
            player.updateTask(s, 3);
        }
    }

    @Override
    public void getLocation() {
        System.out.println(location);
    }
}
