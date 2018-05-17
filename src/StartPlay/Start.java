package StartPlay;

import Places.CampusX;
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


        coki.equipTool(new Internet(InternetType.OPTICAL_FIBER));
        coki.equipTool(new Hardware(HardwareType.PC));
        coki.equipTool(new IDE(IDEType.INTELLIJ));

//        Task task = minkov.assignTask();
//        System.out.println(task);
//        coki.receiveTask(task);
//        System.out.println(coki.getCurrentTask());
        Minkov.generateTaks();
        Task MinkovTask = Minkov.assignTask();
        System.out.println(MinkovTask);
        coki.receiveTask(MinkovTask);
        coki.getCurrentTask();

        if(!(coki.getCurrentTask() != null && coki.getCurrentTask().isCompleted())) {
            coki.getHardAdvice(Minkov);
            System.out.printf("Hard advice given by %s!\n", Minkov.toString());
        }

        coki.rest(1,4);
        ema.generateTaks();
        coki.receiveTask(ema.assignTask());
        System.out.println(ema.assignTask());
        if(!(coki.getCurrentTask() != null && coki.getCurrentTask().isCompleted())) {
            coki.getSoftAdvice(ema);
            System.out.printf("Soft advice given by %s!\n", ema.toString());
        }




        coki.relieveStres(10);

        Boyko.generateTaks();
        coki.receiveTask(Boyko.assignTask());
        System.out.println(Boyko.assignTask());
        coki.getHardAdvice(Minkov);

        Cuki.generateTaks();
        Task cuki = Cuki.assignTask();
        coki.receiveTask(cuki);
        coki.getCurrentTask();
        System.out.println(cuki);

//        coki.getCompletedTasksHistory().forEach(x-> System.out.printf("Solved: %s\n", x));
        coki.relieveStres(50);
        coki.tireOut(50);
        coki.getHardAdvice(Minkov);
        coki.getHardAdvice(Minkov);
        coki.getHardAdvice(Minkov);
        CampusX campus = new CampusX();
        campus.train(coki);
        campus.train(coki);
        campus.train(coki);
        campus.train(coki);
        campus.train(coki);
        campus.train(coki);
        campus.train(coki);
        campus.train(coki);
        campus.train(coki);
        System.out.println("Energy -> " + coki.getEnergy());
        System.out.println("Stress -> " + coki.getStressLevel());
        coki.getCompletedTasksHistory().forEach(x-> System.out.printf("Solved: %s\n", x));
        System.out.println("Rank -> " + coki.getRank());
        System.out.println("Experience -> " + coki.getExperience());
        coki.rankUp();
        System.out.println(coki.getSkills().getAlgorithmicThinking());
        System.out.println(coki.getSkills().getCoding());
        System.out.println(coki.getSkills().getSoftSkills());
        System.out.println("Rank -> " + coki.getRank());
        cuki.getDeadline();
        coki.getCompletedTasksHistory().forEach(x-> System.out.printf("Solved: %s\n", x));
        //coki.rest(12,5);

    }
}
