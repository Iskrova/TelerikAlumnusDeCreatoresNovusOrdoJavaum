package PlayerProperties;

public class Internet extends Instrument {
    private InternetType type;

    public Internet(InternetType type) {
        this.type = type;
        switch (type) {
            case DSL:           getBonusPoints().gainSkill(new Skill(223, 150, 100)); break;
            case LTE:           getBonusPoints().gainSkill(new Skill(220, 60, 100)); break;
            case OPTICAL_FIBER: getBonusPoints().gainSkill(new Skill(200, 75, 100)); break;
        }
    }
}
