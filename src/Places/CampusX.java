package Places;

import Society.Player;

public class CampusX implements Trainable, Locatable {
    private String location = "bul. \"Aleksandar Malinov\" 31, \n" +
                              "1729 g.k. Mladost 1A, Sofia";

    @Override
    public void train(Player player) {
        player.relieveStres(2);
    }

    @Override
    public void getLocation() {
        System.out.println(location);
    }
}
