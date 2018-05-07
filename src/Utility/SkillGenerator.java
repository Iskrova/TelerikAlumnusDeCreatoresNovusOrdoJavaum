package Utility;

import PlayerProperties.Skill;

import java.util.Random;

public class SkillGenerator {
    public  static class Generator {
        public  static Skill generateSkill(int minCoding, int maxCoding, int minSoft, int maxSoft,
                                           int minAlgo, int maxAlgo){
            Random r = new Random();
            int randCoding = r.nextInt(maxCoding-minCoding +1)+minCoding;
            int randSoft = r.nextInt(maxSoft-minSoft +1)+minSoft;
            int randAlgo = r.nextInt(maxAlgo-minAlgo +1)+minAlgo;

            return new Skill(randCoding,randSoft,randAlgo);

        }
    }
}
