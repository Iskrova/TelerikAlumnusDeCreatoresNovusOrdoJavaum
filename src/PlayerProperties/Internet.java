package PlayerProperties;

public class Internet extends Instrument {
    InternetType type;
    private Skill bonusPoints;

    private Internet(InternetType type) {
        this.type = type;
        switch (type) {
            case DSL:           bonusPoints.gainSkill(new Skill(0, 1, 0)); break;
            case LTE:           bonusPoints.gainSkill(new Skill(0, 3, 0)); break;
            case OPTICAL_FIBER: bonusPoints.gainSkill(new Skill(0, 5, 0)); break;
        }
    }
}
