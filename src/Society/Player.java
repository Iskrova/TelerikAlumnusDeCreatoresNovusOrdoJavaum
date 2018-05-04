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
    private Skill skills;
    private int stressLevel;
    private LeisureActivity leisureActivity;
    private Task currentTask;
    private List<Task> completedTasksHistory;

    public void rest(int num){

    }
    public void getSoftAdvice(SoftAdvisor softAdvisor){
        softAdvisor.giveSoftAdvice(this);

    }
    public void getHardAdvice(HardAdvisor hardAdvisor){
        hardAdvisor.giveHardAdvice(this);

    }
    public void receiveTask(Task task){
        if(currentTask == null){
            currentTask = task;
        }else{
            System.out.println("Task in progress.");

        }
    }



    public void updateTask(Skill skill){
        //TODO FIX TASK UPDATE
        currentTask.getSkill().reduceSkill(skill);
        System.out.println("rip");
//        currentTask.doTask(Skill);
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public Skill getSkills() {
        return skills;
    }

    public void stressOut(int stressLevel){
        this.stressLevel += stressLevel;
    }
}
