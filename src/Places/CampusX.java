package Places;

import PlayerProperties.Skill;
import Society.Coder;
import Society.NoCurrentTaskException;
import Society.Player;

public class CampusX implements Trainable, Locatable {
    private String location = "bul. \"Aleksandar Malinov\" 31, \n" +
                              "1729 g.k. Mladost 1A, Sofia";

    @Override
    public void train(Player player) throws NoCurrentTaskException {
        player.relieveStres(2);
        int coding = Coder.getRNG().nextInt(61)+40;
        int soft = Coder.getRNG().nextInt(31)+20;
        int algo = Coder.getRNG().nextInt(101)+50;
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
