package PlayerProperties;

  public abstract class Instrument {
     private Skill bonusPoints;

     public Instrument(){
         bonusPoints = new Skill(0, 0, 0);
     }

     public Skill getBonusPoints(){
         return bonusPoints;
     }

}
