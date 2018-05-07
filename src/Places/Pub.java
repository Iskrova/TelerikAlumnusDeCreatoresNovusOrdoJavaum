package Places;

import PlayerProperties.Skill;
import Society.Coder;
import Society.NoCurrentTaskException;
import Society.Player;

public class Pub implements Trainable, Locatable{
    private String location = "ul. \"General Yosif V. Gourko\" 16,\n" +
                              "1000 Sofia";

    @Override
    public void train(Player player) throws NoCurrentTaskException {
        player.relieveStres(4);
        int coding = Coder.getRNG().nextInt(10)+1;
        int soft = Coder.getRNG().nextInt(101)+20;
        int algo = Coder.getRNG().nextInt(10)+1;
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
