package Society;

import PlayerProperties.Rank;

public  abstract class Fellow extends Coder {
    public Fellow(String name) {
        super(name, Rank.FELLOW);
    }
}
