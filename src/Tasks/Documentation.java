package Tasks;

import PlayerProperties.Skill;
import Utility.Reader;
import Utility.Utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Documentation extends Task {
    private final static int minCoding =200;
    private final static int maxCoding =400;
    private final static int minSoft =100;
    private final static int maxSoft =135;
    private final static int minAlgo =100;
    private final static int maxAlgo =300;
    public Documentation(String name, Skill requirements, String description, boolean completed) {
        super(minCoding,maxCoding, minSoft, maxSoft, minAlgo, maxAlgo,
                requirements, name,  description, completed);
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

    @Override
    public ArrayList<Task> generateTasks() {
        Map<String, String> map = new HashMap<>();
        ArrayList<Task> tasks= new ArrayList<>();
        map = Reader.ReadTasks.getAllTasks("DocumentationTasksDescription");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Task t = new Documentation(entry.getKey(),
                    Utility.SkillGenerator.generateSkill(Documentation.getMinCoding(),
                    Documentation.getMaxCoding(),Documentation.getMinSoft(),Documentation.getMaxSoft(),
                    Documentation.getMinAlgo(),Documentation.getMaxAlgo()),
                    entry.getValue(),false) ;
            tasks.add(t);
        }
        return tasks;
    }
}
