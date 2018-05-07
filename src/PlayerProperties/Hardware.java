package PlayerProperties;

public class Hardware extends Instrument {
    private HardwareType type;

    public Hardware(HardwareType type) {
        this.type = type;
        switch (type) {
            case MOBILE:    getBonusPoints().gainSkill(new Skill(200, 100, 150)); break;
            case LAPTOP:    getBonusPoints().gainSkill(new Skill(230,121,160)); break;
            case PC:        getBonusPoints().gainSkill(new Skill(250,110,175)); break;
        }
    }



}
