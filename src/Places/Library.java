package Places;

import Society.Player;

public class Library  implements Trainable, Locatable{
    private String location = "Technical University,\n" +
                              "bul. \"St.Kliment Ohridski\" 8,\n" +
                              "1756 Sofia";

    @Override
    public void train(Player player) {
        player.relieveStres(1);
    }

    @Override
    public void getLocation() {
        System.out.println(location);
    }
}
