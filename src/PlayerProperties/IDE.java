package PlayerProperties;

public class IDE extends Instrument {
    private IDEType type;

    public IDE(IDEType type) {
        this.type = type;
        switch (type) {
            case NETBEANS:  getBonusPoints().gainSkill(new Skill(280, 100, 220)); break;
            case ECLIPSE:   getBonusPoints().gainSkill(new Skill(260, 100, 200)); break;
            case INTELLIJ:  getBonusPoints().gainSkill(new Skill(275,100,210)); break;
        }
    }

}
