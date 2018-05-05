package Places;

import Society.Player;

public class Pub implements Trainable, Locatable{
    private String location = "ul. \"General Yosif V. Gourko\" 16,\n" +
                              "1000 Sofia";

    @Override
    public void train(Player player) {
        player.relieveStres(4);
    }

    @Override
    public void getLocation() {
        System.out.println(location);
    }
}
