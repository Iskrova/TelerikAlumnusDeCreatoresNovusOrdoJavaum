package Activites;

import Society.Player;

public class LeisureActivity {

    public  void pickActivity(Player player, int choice){

        switch (choice){
            case 1:
                goOut(player); break;
            case 2:
                learn(player); break;
            case 3:
                drinkBeer(player); break;
            case 4:
                goToTheBeach(player); break;
            case 5:
                goSightseeing(player); break;
            default:
                break;
        }
    }
    private void goOut(Player player){
        //TODO
    }
    private void learn(Player player){
        //TODO
    }
    private void drinkBeer(Player player){
        //TODO
    }
    private void goToTheBeach(Player player){
        //TODO
    }
    private void goSightseeing(Player player){
        //TODO
    }
}
