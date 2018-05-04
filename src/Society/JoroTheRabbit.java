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
        System.out.println("");
        return false;
    }
}
