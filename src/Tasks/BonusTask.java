package Tasks;

import PlayerProperties.Skill;
import Utility.SkillGenerator;

import java.util.ArrayList;
import java.util.Map;

public class BonusTask extends Task {
    public BonusTask(String name, String description,Skill requrements) {
        super(0,0,0,0,0,0,
                requrements, name,0,  description,true);
    }
    private static String[] names=new String[]{"Lucky Number", "Magic", "Miracle"};
    private static String description= " Congratulations!\n" +
            "You get a bonus task autocompleted and also gain the experience, required for the task ";


    public static ArrayList<Task> generateTasks() {
        ArrayList<Task> tasks= new ArrayList<>();
        for (String name : names) {
            Task t = new BonusTask(name,description,SkillGenerator.Generator.generateSkill(10,125,
                    15, 55,55,130));
            tasks.add(t);
        }
    return tasks;
    }
}
