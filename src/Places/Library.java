package Places;

import PlayerProperties.Skill;
import Society.Coder;
import Society.NoCurrentTaskException;
import Society.Player;

public class Library  implements Trainable, Locatable{
    private String location = "Technical University,\n" +
                              "bul. \"St.Kliment Ohridski\" 8,\n" +
                              "1756 Sofia";

    @Override
    public void train(Player player) throws NoCurrentTaskException {
        player.relieveStres(1);
        int coding = Coder.getRNG().nextInt(21)+10;
        int soft = Coder.getRNG().nextInt(61)+40;
        int algo = Coder.getRNG().nextInt(61)+40;
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
