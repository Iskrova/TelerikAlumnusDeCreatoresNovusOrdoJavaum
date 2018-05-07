package Tasks;

import PlayerProperties.Skill;
import Utility.Reader;
import Utility.SkillGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Algo extends Task {

    private final static int minCoding =100;
    private final static int maxCoding =400;
    private final static int minSoft =5;
    private final static int maxSoft =35;
    private final static int minAlgo =300;
    private final static int maxAlgo =600;
    public Algo(String name, Skill requirements, String description, boolean completed) {
        super(getMinCoding(),getMaxCoding(),getMinSoft(), getMaxSoft(), getMinAlgo(), getMaxAlgo(),
                requirements, name,500,  description, completed);
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


    public  static ArrayList<Task> generateTasks() {
        Map<String, String> map = new HashMap<>();
        ArrayList<Task> tasks= new ArrayList<>();
        map = Reader.ReadTasks.getAllTasks("AlgoTasksDescriptions");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Task t = new Algo(entry.getKey(),
                    SkillGenerator.Generator.generateSkill(Algo.getMinCoding(),Algo.getMaxCoding(),
                    Algo.getMinSoft(),Algo.getMaxSoft(),Algo.getMinAlgo(),Algo.getMaxAlgo()),
                    entry.getValue(),false) ;
            tasks.add(t);

        }
        return tasks;
    }

    @Override
    public String toString() {
        return String.format("Task name is: \"%s\" with deadline:%f ", super.getName(), super.getDeadline());
    }
}
