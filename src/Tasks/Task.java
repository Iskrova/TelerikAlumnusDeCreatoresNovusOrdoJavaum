package Tasks;

import PlayerProperties.Skill;

public abstract class Task {
    private final int MIN_CODING;
    private final int MAX_CODING;
    private final int MAX_SOFT;
    private final int MIN_SOFT;
    private final int MIN_ALGO;
    private final int MAX_ALGO;

    private String name;
    private Skill requirements;
    private double deadline;
    private String description;
    private boolean completed = false;

    public Task(int MIN_CODING, int MAX_CODING, int MAX_SOFT, int MIN_SOFT, int MIN_ALGO, int MAX_ALGO) {
        //TODO FIX
        this.MIN_CODING = MIN_CODING;
        this.MAX_CODING = MAX_CODING;
        this.MAX_SOFT = MAX_SOFT;
        this.MIN_SOFT = MIN_SOFT;
        this.MIN_ALGO = MIN_ALGO;
        this.MAX_ALGO = MAX_ALGO;
    }

    public Skill getRequirements() {
        return requirements;
    }

    public void reduceDeadline(int time){
        deadline -= time;
    }

    public double getDeadline() {
        return deadline;
    }

    public void complete(){
        if(requirements.getCoding() == 0
        && requirements.getSoftSkills() == 0
        && requirements.getAlgorithmicThinking() == 0){
            completed = true;
        }
    }

    public boolean isCompleted() {
        return completed;
    }
}
