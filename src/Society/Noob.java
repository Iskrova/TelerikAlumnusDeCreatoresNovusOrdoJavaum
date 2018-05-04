package Society;

public class Noob extends Entered implements HardAdvisor{

    public Noob(String name) {
        super(name);
    }

    @Override
    public void giveHardAdvice(Player player) {
        player.stressOut(5);
        System.out.println("lol");
    }

    @Override
    public void generateTaks() {

        System.out.println("Noobs can't assign tasks");
    }
}