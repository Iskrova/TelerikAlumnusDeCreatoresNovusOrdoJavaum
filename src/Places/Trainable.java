package Places;

import Society.NoCurrentTaskException;
import Society.Player;

public interface Trainable {
    void train(Player player) throws NoCurrentTaskException;
}
