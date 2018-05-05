package Utility;

import PlayerProperties.Skill;

import java.util.Random;

public class Utility {
    public static class NameValidator{
        public static boolean isValid(String name ){
            boolean isTrue = true;

            if(name.isEmpty() ||name.length()<3 || name.length()>30){
                isTrue=false;

            }
            return isTrue;
        }
    }
    public  static class SkillGenerator {
        public  static Skill generateSkill(int minCoding, int maxCoding, int minSoft, int maxSoft,
                                           int minAlgo, int maxAlgo){
            Random r = new Random();
            int randcoding = r.nextInt(maxCoding-minCoding +1)+minCoding;
            int randSoft = r.nextInt(maxSoft-minSoft +1)+minSoft;
            int randAlgo = r.nextInt(maxAlgo-minAlgo +1)+minAlgo;
            Skill randomSkill = new Skill(randcoding,randSoft,randAlgo);

            return randomSkill;

        }
    }
}
