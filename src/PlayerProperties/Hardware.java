package PlayerProperties;

public class Hardware extends Instrument {
    private HardwareType type;

    private Hardware(HardwareType type) {
        this.type = type;
        switch (type) {
            case MOBILE:    getBonusPoints().gainSkill(new Skill(0, 0, 15)); break;
            case LAPTOP:    getBonusPoints().gainSkill(new Skill(0,0,60)); break;
            case PC:        getBonusPoints().gainSkill(new Skill(0,0,75)); break;
        }
    }



}
