package Society;

public class Noob extends Entered implements HardAdvisor{

    public Noob(String name) {
        super(name);
    }

    @Override
    public void giveHardAdvice(Player player) {
        System.out.println("lol");
    }

    @Override
    public void generateTaks() {
        System.out.println("Noobs can't assign tasks");
    }
}