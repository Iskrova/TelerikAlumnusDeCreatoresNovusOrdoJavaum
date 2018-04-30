package Society;

import PlayerProperties.Rank;
import Tasks.Task;

import java.util.ArrayList;
import java.util.List;

public  abstract class Coder {
    private String name;
    private List<Task> tasks;
    private Rank rank;

    public Coder(String name, Rank rank) {
        setName(name);
        this.rank = rank;
        tasks = new ArrayList<>();
    }

    private void setName(String name) {
        if(name.isEmpty() ||name.length()<3 || name.length()>30){
            System.out.println("Invalid name!");
            return;
        }
    }
}
