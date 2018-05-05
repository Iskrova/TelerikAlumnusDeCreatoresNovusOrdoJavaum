package Society;

import PlayerProperties.Rank;

public  abstract class MasterCoder extends Coder {
    private static final int MIN_EXPERIENCE = 813;

    public MasterCoder(String name) {

        super(name, Rank.MASTER);
    }

    public static int getMinExperience() {
        return MIN_EXPERIENCE;
    }

}
