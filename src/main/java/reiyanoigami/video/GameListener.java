package reiyanoigami.video;

import arc.*;
import arc.graphics.g2d.*;

public class GameListener extends ApplicationCore {
    @Override
    public void setup() {
        Core.atlas = new TextureAtlas("sprites/sprites.aatls");

        add(new WorldRenderer());
    }
}
