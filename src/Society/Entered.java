package Society;

import PlayerProperties.Rank;

public  abstract class Entered extends Coder {
    private static final int MIN_EXPERIENCE = 300;
    private static final int MAX_EXPERIENCE = 555;
    public Entered(String name) {
        super(name, Rank.ENTERED);
    }

    public static int getMinExperience() {
        return MIN_EXPERIENCE;
    }

    public static int getMaxExperience() {
        return MAX_EXPERIENCE;
    }
}
