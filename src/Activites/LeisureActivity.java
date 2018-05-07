package Activites;

import Society.Player;

public class LeisureActivity {

    public  void pickActivity(Player player, int activityChoice, int time){
        int energy = player.getEnergy();
        switch (activityChoice){
            case 1:
                goOut(player, energy, time); break;
            case 2:
                learn(player, energy, time); break;
            case 3:
                drinkBeer(player, energy, time); break;
            case 4:
                goToTheBeach(player, energy, time); break;
            case 5:
                goSightseeing(player, energy, time); break;
            default:
                break;
        }
    }
    private void goOut(Player player, int energy, int time){
        player.setEnergy(energy + 1);
        player.getCurrentTask().reduceDeadline(time);
    }
    private void learn(Player player, int energy, int time){
        player.setEnergy(energy + 2);
        player.getCurrentTask().reduceDeadline(time);
    }
    private void drinkBeer(Player player, int energy, int time){
        player.setEnergy(energy + 3);
        player.getCurrentTask().reduceDeadline(time);
    }
    private void goToTheBeach(Player player, int energy, int time){
        player.setEnergy(energy + 4);
        player.getCurrentTask().reduceDeadline(time);
    }
    private void goSightseeing(Player player, int energy, int time){
        player.setEnergy(energy + 5);
        player.getCurrentTask().reduceDeadline(time);
    }
}
