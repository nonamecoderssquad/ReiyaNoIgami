package reiyanoigami.video;

import arc.ApplicationCore;
import arc.util.Log;
import reiyanoigami.Vars;

public class GameListener extends ApplicationCore {
    @Override
    public void setup() {
        new Vars();
        add(new WorldRenderer());
    }
}
