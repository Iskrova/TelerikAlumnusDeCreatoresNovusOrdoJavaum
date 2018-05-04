package PlayerProperties;

public class Skill {
     private int coding;
     private int softSkills;
     private int algorithmicThinking;

     public Skill(int coding, int softSkills, int algorithmicThinking){
         this.coding = coding;
         this.softSkills = softSkills;
         this.algorithmicThinking = algorithmicThinking;
     }

     public void reduceSkill(Skill s){
         coding -= s.coding;
         softSkills -= s.softSkills;
         algorithmicThinking -= s.algorithmicThinking;

     }
    public void gainSkill(Skill s){
        coding += s.coding;
        softSkills += s.softSkills;
        algorithmicThinking += s.algorithmicThinking;

    }


}
