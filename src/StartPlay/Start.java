package StartPlay;

import PlayerProperties.*;
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



        coki.equipTool(new Internet(InternetType.DSL));
        coki.equipTool(new Hardware(HardwareType.LAPTOP));
        coki.equipTool(new IDE(IDEType.ECLIPSE));

        Minkov.generateTaks();
        coki.receiveTask(Minkov.assignTask());
        coki.getCurrentTask();
        System.out.println(Minkov.assignTask());
        coki.getHardAdvice(Minkov);

        coki.rest(1,4);

        coki.receiveTask(ema.assignTask());
        coki.getSoftAdvice(ema);


        coki.relieveStres(10);
        Boyko.generateTaks();
        coki.receiveTask(Boyko.assignTask());
        System.out.println(Boyko.assignTask());
        coki.getHardAdvice(Minkov);

        Cuki.generateTaks();
        Task cuki = Cuki.assignTask();
        coki.receiveTask(cuki);
        System.out.println(cuki);


        coki.getCompletedTasksHistory();
        coki.getCompletedTasksHistory().forEach(x-> System.out.printf("Solved tasks are: %s ", x));
        //coki.getHardAdvice(Minkov);
        coki.relieveStres(50);
        coki.tireOut(50);
        coki.rankUp();
        //coki.rest(12,5);
    }
}
