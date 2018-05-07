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

}
