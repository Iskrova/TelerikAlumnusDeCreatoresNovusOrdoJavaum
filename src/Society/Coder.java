package Society;

import PlayerProperties.Rank;
import Tasks.Task;
import Tasks.TaskGenerator;
import Utility.Utility;

import java.util.*;

public  abstract class Coder {


    private static final Random RNG = new Random();

    private static Map<String, ArrayList<Task>> allTasks = TaskGenerator.Generator.generateAllTasksTypes();

    private String name;
    private List<Task> tasks;
    private Rank rank;

    public Coder(String name, Rank rank) {
        setName(name);
        this.rank = rank;
        tasks = new ArrayList<>();
    }

    private void setName(String name) {
        if(!(Utility.NameValidator.isValid(name))){
            throw new IllegalArgumentException("Not valid name!");
        }
        this.name=name;
    }

    public static Map<String, List<Task>> getAllTasks(){
        return Collections.unmodifiableMap(allTasks);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Rank getRank() {
        return rank;
    }

    public static Random getRNG() {
        return RNG;
    }

    public abstract void generateTaks();
}
