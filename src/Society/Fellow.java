package Society;

import PlayerProperties.Rank;

public  abstract class Fellow extends Coder {
    private static final int MIN_EXPERIENCE = 556;
    private static final int MAX_EXPERIENCE = 812;

    public Fellow(String name) {
        super(name, Rank.FELLOW);
    }

    public static int getMinExperience() {
        return MIN_EXPERIENCE;
    }

    public static int getMaxExperience() {
        return MAX_EXPERIENCE;
    }
}
