package Tasks;

import PlayerProperties.Skill;
import Utility.Reader;
import Utility.SkillGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Presentation extends Task {
    private final static int minCoding =20;
    private final static int maxCoding =55;
    private final static int minSoft =300;
    private final static int maxSoft =500;
    private final static int minAlgo =100;
    private final static int maxAlgo =255;
    public Presentation(String name, Skill requirements, String description, boolean completed) {
        super(minCoding,maxCoding, minSoft, maxSoft, minAlgo, maxAlgo,
                requirements, name,1, description, completed);
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
        map = Reader.ReadTasks.getAllTasks("PresentationTasksDescriptions");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Task t = new Presentation(entry.getKey(),
                    SkillGenerator.Generator.generateSkill(Presentation.getMinCoding(),
                    Presentation.getMaxCoding(),Presentation.getMinSoft(),
                    Presentation.getMaxSoft(),Presentation.getMinAlgo(),Presentation.getMaxAlgo()),
                    entry.getValue(),false) ;
            tasks.add(t);
        }
        return tasks;
    }
}
