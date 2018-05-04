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
         if(coding < 0) {
             coding = 0;
         }
         softSkills -= s.softSkills;
         if(softSkills < 0) {
             softSkills = 0;
         }
         algorithmicThinking -= s.algorithmicThinking;
         if(algorithmicThinking < 0) {
             algorithmicThinking = 0;
         }

     }
    public void gainSkill(Skill s){
        coding += s.coding;
        softSkills += s.softSkills;
        algorithmicThinking += s.algorithmicThinking;

    }

    public int getCoding() {
        return coding;
    }

    public int getSoftSkills() {
        return softSkills;
    }

    public int getAlgorithmicThinking() {
        return algorithmicThinking;
    }

}
