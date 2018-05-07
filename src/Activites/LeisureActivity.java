package Activites;

import Society.Player;

public class LeisureActivity {

    public  void pickActivity(Player player, int activityChoice){
        int energy = player.getEnergy();
        switch (activityChoice){
            case 1:
                goOut(player, energy); break;
            case 2:
                learn(player, energy); break;
            case 3:
                drinkBeer(player, energy); break;
            case 4:
                goToTheBeach(player, energy); break;
            case 5:
                goSightseeing(player, energy); break;
            default:
                break;
        }
    }
    private void goOut(Player player, int energy){
        player.setEnergy(energy + 1);
        player.getCurrentTask().reduceDeadline(1);
    }
    private void learn(Player player, int energy){
        player.setEnergy(energy + 2);
        player.getCurrentTask().reduceDeadline(1);
    }
    private void drinkBeer(Player player, int energy){
        player.setEnergy(energy + 3);
        player.getCurrentTask().reduceDeadline(1);
    }
    private void goToTheBeach(Player player, int energy){
        player.setEnergy(energy + 4);
        player.getCurrentTask().reduceDeadline(1);
    }
    private void goSightseeing(Player player, int energy){
        player.setEnergy(energy + 5);
        player.getCurrentTask().reduceDeadline(1);
    }
}
