package PlayerProperties;

public class Hardware extends Instrument {
    HardwareType type;
    private Skill bonusPoints;

    private Hardware(HardwareType type) {
        this.type = type;
        switch (type) {
            case MOBILE:    bonusPoints.gainSkill(new Skill(0, 0, 1)); break;
            case LAPTOP:    bonusPoints.gainSkill(new Skill(0,0,3)); break;
            case PC:        bonusPoints.gainSkill(new Skill(0,0,5)); break;
        }
    }



}
