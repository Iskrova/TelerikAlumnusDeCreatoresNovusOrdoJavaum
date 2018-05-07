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
    public static void main(String[] args) {
        Player coki = new Player("Coki");
        Doncho Minkov = new Doncho();
        Emma ema = new Emma();
        CTO Boyko = new CTO("Boyko");
        Ninja Cuki = new Ninja("Cuki");
        Task t = new Algo("fgdf", SkillGenerator.Generator.generateSkill(10,100,
                10,20,100,200),"khkhj",false);
        Map<String,ArrayList<Task>> map = TaskGenerator.Generator.generateAllTasksTypes();




        coki.receiveTask(Minkov.assignTask());
        coki.getCurrentTask();
        //coki.getHardAdvice(Minkov);

        coki.receiveTask(ema.assignTask());
        //coki.getSoftAdvice(ema);

        //coki.rest(1,4);
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
