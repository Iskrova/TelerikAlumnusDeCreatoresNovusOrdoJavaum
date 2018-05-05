package Places;

import Society.Player;

public class Temple implements Trainable, Locatable {
    private  String location = "Oracle Corporation\n" +
                               "500 Oracle Parkway\n" +
                               "Redwood Shores, CA 94065";

    @Override
    public void train(Player player) {
        player.relieveStres(3);
    }

    @Override
    public void getLocation() {
        System.out.println(location);
    }
}
