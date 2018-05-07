package PlayerProperties;

public class IDE extends Instrument {
    private IDEType type;

    private IDE(IDEType type) {
        this.type = type;
        switch (type) {
            case NETBEANS:  getBonusPoints().gainSkill(new Skill(15, 0, 0)); break;
            case ECLIPSE:   getBonusPoints().gainSkill(new Skill(60, 0, 0)); break;
            case INTELLIJ:  getBonusPoints().gainSkill(new Skill(75,0,0)); break;
        }
    }

}
