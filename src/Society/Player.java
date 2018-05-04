package Society;

import Activites.LeisureActivity;
import PlayerProperties.Rank;
import PlayerProperties.Skill;
import Tasks.Task;

import java.util.ArrayList;
import java.util.Collections;
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

    public Player(String name){
        this.name = name;
        energy = 100;
        experience = 0;
        reqXP = 100;
        stressLevel = 0;
        rank = Rank.ENTERED;
        skills = new Skill(10, 5, 10);
        leisureActivity = new LeisureActivity();
        completedTasksHistory = new ArrayList<>();
    }

    public void rest(int hours){
        energy = Math.min(energy, 100);
        stressLevel -= hours * 13;
        stressLevel = Math.max(0, stressLevel);
        if(currentTask == null) {
            return;
        }
        currentTask.reduceDeadline(hours);
        if(currentTask.getDeadline() <= 0){
            System.out.println("Task failed");
            experience = (int) Math.round(experience * 0.75);
        }
    }

    public void relieveStres( int stressRelieved){
        if(stressLevel - stressRelieved >= 0){
            stressLevel -= stressRelieved;
        }
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

    public List<Task> getCompletedTasksHistory() {
        return Collections.unmodifiableList(completedTasksHistory);
    }

    public void updateTask(Skill skill, int time){
        //TODO FIX TASK UPDATE
        currentTask.reduceDeadline(time);
        if(currentTask.getDeadline() < 0){
            System.out.println("Task failed");
            currentTask = null;
            experience = (int ) Math.round(experience * 0.75);
        }
        currentTask.getRequirements().reduceSkill(skill);
        currentTask.complete();
        if(currentTask.isCompleted()){
            completedTasksHistory.add(currentTask);
            experience += 50;
            currentTask = null;

        }

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

    public boolean tireOut(int energyLost){
        if(energy-energyLost >= 0) {
            energy -= energyLost;
            return true;
        }else{
            System.out.println("Not enough energy");
            return false;
        }
    }

    public void rankUp(){
        if(experience < reqXP){
            System.out.println("Not enough experience to rank up");
            return;
        }
        JoroTheRabbit joro = JoroTheRabbit.getInstance();
        if(joro.offerChoice(this)){
            experience = 0;
            if(rank == Rank.ENTERED){
                rank = Rank.FELLOW;
                reqXP = reqXP * 2;
            }else{
                rank = Rank.MASTER;
                reqXP = (int) Math.round(reqXP * 1.5);
            }
        }

    }
}
