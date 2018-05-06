package PlayerProperties;

public class IDE extends Instrument {
    IDEType type;
    private Skill bonusPoints;

    private IDE(IDEType type) {
        this.type = type;
        switch (type) {
            case NETBEANS:  bonusPoints.gainSkill(new Skill(1, 0, 0)); break;
            case ECLIPSE:   bonusPoints.gainSkill(new Skill(3, 0, 0)); break;
            case INTELLIJ:  bonusPoints.gainSkill(new Skill(5,0,0)); break;
        }
    }

}
