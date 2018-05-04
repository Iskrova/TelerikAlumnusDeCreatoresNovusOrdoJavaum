package Society;

import Tasks.Algo;
import Tasks.OOP;
import Tasks.Task;

public class Doncho extends Fellow implements HardAdvisor, HardTaskAssignable {
    private static Doncho ourInstance = new Doncho();

    public static Doncho getInstance() {
        return ourInstance;
    }

    private Doncho() {
        super("Doncho");
    }

    @Override
    public void giveHardAdvice(Player player) {
        int codingSkill = Coder.getRNG().nextInt(11) + 5;
        int algoThinking = Coder.getRNG().nextInt(11) + 5;
        player.getSkills().gainSkill(codingSkill, 0, algoThinking);

    }

    @Override
    public Task assignTask() {
        int pool = getTasks().size();
        if(pool == 0){
            return null;
        }
        int task = Coder.getRNG().nextInt(pool);
        return getTasks().remove(task);
    }

    @Override
    public void generateTaks() {
        for(int i = 0; i < 5; i++){
            getTasks().add(new Algo());
            getTasks().add(new OOP());
        }
    }
}
