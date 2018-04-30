package Society;

import Activites.LeisureActivity;
import PlayerProperties.Rank;
import PlayerProperties.Skill;
import Tasks.Task;

import java.util.List;

public class Player {
    private String name;
    private int energy;
    private int experience;
    private int reqXP;
    private Rank rank;
    private Skill skill;
    private int stressLevel;
    private LeisureActivity leisureActivity;
    private Task currentTask;
    private List<Task> completedTasksHistory;

    public void rest(int num){

    }
    public void getSoftAdvice(SoftAdvisor softAdvisor){

    }
    public void getHardAdvice(HardAdvisor hardAdvisor){

    }
    public void receiveTask(Task task){

    }

}
