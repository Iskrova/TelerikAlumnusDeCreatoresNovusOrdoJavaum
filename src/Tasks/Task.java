package Tasks;

import PlayerProperties.Skill;
import Utility.MySetterRequirementException;
import Utility.SkillGenerator;

public abstract class Task {
    private final int MIN_CODING;
    private final int MAX_CODING;
    private final int MIN_SOFT;
    private final int MAX_SOFT;
    private final int MIN_ALGO;
    private final int MAX_ALGO;
    private String name;
    private Skill requirements;
    private double deadline;
    private String description;
    private boolean completed;

    public Task(int MIN_CODING, int MAX_CODING, int MIN_SOFT, int MAX_SOFT, int MIN_ALGO, int MAX_ALGO,
                Skill requirements, String name, double deadline, String description, boolean completed) {
        this.MIN_CODING = MIN_CODING;
        this.MAX_CODING = MAX_CODING;
        this.MAX_SOFT = MAX_SOFT;
        this.MIN_SOFT = MIN_SOFT;
        this.MIN_ALGO = MIN_ALGO;
        this.MAX_ALGO = MAX_ALGO;
        this.name = name;
        setRequirements(requirements);
        this.requirements = requirements;
        setDeadline(deadline);
        this.description = description;
        this.completed = completed;
    }

    private int getMIN_CODING() {
        return MIN_CODING;
    }

    private int getMAX_CODING() {
        return MAX_CODING;
    }

    private int getMIN_SOFT() {
        return MIN_SOFT;
    }

    private int getMAX_SOFT() {
        return MAX_SOFT;
    }

    private int getMIN_ALGO() {
        return MIN_ALGO;
    }

    private int getMAX_ALGO() {
        return MAX_ALGO;
    }

    public void setRequirements(Skill requirements) {
        if (!((requirements.getCoding() >= MIN_CODING && requirements.getCoding() <= MAX_CODING)
                && (requirements.getSoftSkills() >= MIN_SOFT && requirements.getSoftSkills() <= MAX_SOFT)
                && (requirements.getAlgorithmicThinking() >= MIN_ALGO && requirements.getAlgorithmicThinking() <= MAX_ALGO))) {
            try {
                throw new MySetterRequirementException(" Skill requirements not valid!");
            } catch (MySetterRequirementException e) {
                e.printStackTrace();
            }
        } this.requirements = requirements;

    }

    private void setDeadline(double deadline) {
        deadline = calculateDeadline(deadline, SkillGenerator.Generator.generateSkill(getMIN_CODING(),getMAX_CODING(),
                getMIN_SOFT(),getMAX_SOFT(),getMIN_ALGO(),getMAX_ALGO()));
        this.deadline = deadline;
    }


    public Skill getRequirements() {
        return requirements;
    }

    public void reduceDeadline(int time) {
        deadline -= time;
    }

    public double getDeadline() {
        return deadline;
    }

    public String getName() {
        return name;
    }

    private double calculateDeadline(double d, Skill requirements) {
        double resultCoding = requirements.getCoding() / MAX_CODING;
        resultCoding *= 100;
        double resultSoft = requirements.getSoftSkills() / MAX_SOFT;
        resultSoft *= 100;
        double resultAlgo = requirements.getAlgorithmicThinking() / MAX_ALGO;
        resultSoft *= 100;
        return  d+ resultCoding + resultAlgo + resultSoft;
    }

    public void complete() {
        if (requirements.getCoding() <= 0
                && requirements.getSoftSkills() <= 0
                && requirements.getAlgorithmicThinking() <= 0) {
            completed = true;
        }else{
            completed = false;
        }
    }

    public boolean isCompleted() {
        return completed;
    }


}