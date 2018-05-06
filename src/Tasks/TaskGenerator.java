package Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskGenerator {
    public static class Generator {
        public static Map<String,ArrayList<Task>> generateAllTasksTypes() {
            Map<String,ArrayList<Task>> allTasks = new HashMap<>();
            ArrayList<Task> algoTasks = Algo.generateTasks();
            ArrayList<Task> OOPTasks = OOP.generateTasks();
            ArrayList<Task> documentationTasks = Documentation.generateTasks();
            ArrayList<Task> presentationTasks =Presentation.generateTasks();
            ArrayList<Task> bonusTasks = BonusTask.generateTasks();

            allTasks.put("Algo",algoTasks);
            allTasks.put("OOP",OOPTasks);
            allTasks.put("Documentation",documentationTasks);
            allTasks.put("Presentation", presentationTasks);
            allTasks.put("Bonus",bonusTasks);

            return allTasks;

        }

    }

}
