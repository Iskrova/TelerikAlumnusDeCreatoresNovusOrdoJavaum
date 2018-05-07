package PlayerProperties;

public class Internet extends Instrument {
    private InternetType type;

    private Internet(InternetType type) {
        this.type = type;
        switch (type) {
            case DSL:           getBonusPoints().gainSkill(new Skill(0, 15, 0)); break;
            case LTE:           getBonusPoints().gainSkill(new Skill(0, 60, 0)); break;
            case OPTICAL_FIBER: getBonusPoints().gainSkill(new Skill(0, 75, 0)); break;
        }
    }
}
