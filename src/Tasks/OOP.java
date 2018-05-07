package Tasks;

import PlayerProperties.Skill;
import Utility.Reader;
import Utility.SkillGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OOP extends Task {
    private final static int minCoding =300;
    private final static int maxCoding =600;
    private final static int minSoft =200;
    private final static int maxSoft =235;
    private final static int minAlgo =200;
    private final static int maxAlgo =400;
    public OOP(String name, Skill requirements, String description, boolean completed) {
        super(minCoding,maxCoding, minSoft, maxSoft, minAlgo, maxAlgo,
                requirements, name, 500,  description, completed);
    }

    public static int getMinCoding() {
        return minCoding;
    }

    public static int getMaxCoding() {
        return maxCoding;
    }

    public static int getMinSoft() {
        return minSoft;
    }

    public static int getMaxSoft() {
        return maxSoft;
    }

    public static int getMinAlgo() {
        return minAlgo;
    }

    public static int getMaxAlgo() {
        return maxAlgo;
    }




    public static ArrayList<Task> generateTasks() {
        Map<String, String> map = new HashMap<>();
        ArrayList<Task> tasks= new ArrayList<>();
        map = Reader.ReadTasks.getAllTasks("OOPTasksDescription");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Task t = new OOP(entry.getKey(),
                    SkillGenerator.Generator.generateSkill(OOP.getMinCoding(),OOP.getMaxCoding(),
                    OOP.getMinSoft(),OOP.getMaxSoft(),OOP.getMinAlgo(),OOP.getMaxAlgo()),
                    entry.getValue(),false) ;
            tasks.add(t);
        }
        return tasks;
    }

    @Override
    public String toString() {
        return String.format("Task name is: \"%s\" with deadline:%f ",super.getName(), super.getDeadline()) ;
    }
}
