package StartPlay;

import PlayerProperties.Skill;
import Society.*;
import Tasks.Algo;
import Tasks.Task;
import Tasks.TaskGenerator;
import Utility.SkillGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Start {
    public static void main(String[] args) throws NoCurrentTaskException {
        Player coki = new Player("Coki");
        Doncho Minkov = new Doncho();
        Emma ema = new Emma();
        CTO Boyko = new CTO("Boyko");
        Ninja Cuki = new Ninja("Cuki");
        Task t = new Algo("fgdf", SkillGenerator.Generator.generateSkill(Algo.getMinCoding(),Algo.getMaxCoding(),
                Algo.getMinSoft(),Algo.getMaxSoft(),Algo.getMinAlgo(),Algo.getMaxAlgo()),"khkhj",false);
        //Map<String,ArrayList<Task>> map = TaskGenerator.Generator.generateAllTasksTypes();
        //for (Map.Entry<String, ArrayList<Task>> entry : map.entrySet()) {
         //   coki.receiveTask((Task) entry);
        //}




        coki.receiveTask(t);
        coki.getCurrentTask();
        coki.getHardAdvice(Minkov);

        coki.receiveTask(ema.assignTask());
        coki.getSoftAdvice(ema);

        coki.rest(1,4);
        coki.relieveStres(10);

        coki.receiveTask(Boyko.assignTask());
       // coki.getHardAdvice(Minkov);

        coki.receiveTask(Cuki.assignTask());
        //coki.getHardAdvice(Minkov);
        coki.relieveStres(50);
        coki.tireOut(50);
        //coki.rest(12,5);
    }
}
