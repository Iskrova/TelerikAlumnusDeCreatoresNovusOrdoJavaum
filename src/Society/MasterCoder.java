package Society;

import PlayerProperties.Rank;

public  abstract class MasterCoder extends Coder {
    public MasterCoder(String name) {
        super(name, Rank.MASTER);
    }
}
