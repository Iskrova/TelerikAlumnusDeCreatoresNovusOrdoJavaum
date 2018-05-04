package Society;

import java.util.Scanner;

public class JoroTheRabbit {
    private  final String NAME = "Joro The Rabbit";
    private static JoroTheRabbit ourInstance = new JoroTheRabbit();

    public static JoroTheRabbit getInstance() {
        return ourInstance;
    }

    private JoroTheRabbit() {
    }
    public boolean offerChoice(Player player){
        Scanner sc = new Scanner(System.in);
        System.out.println("DO you want to give up and become a farmer?" +
                " Or do you want to RANK UP and continue struggling " +
                "in an attempt to reach your ultimate goal?");
        System.out.println("Type RED if you want to give up and BLUE if you wish to continue");
        String choice = sc.nextLine();
        while(!choice.toUpperCase().equals("RED") && !choice.toUpperCase().equals("BLUE")){
            choice = sc.nextLine();
        }
        return choice.toUpperCase().equals("RED") ? false : true;
    }

    public String getNAME() {
        return NAME;
    }
}
