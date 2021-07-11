package reiyanoigami.video;

import arc.*;
import arc.graphics.Camera;
import arc.graphics.g2d.*;
import arc.util.Log;
import reiyanoigami.Vars;
import reiyanoigami.game.World;

public class GameListener extends ApplicationCore {
    @Override
    public void setup() {
        Core.atlas = new TextureAtlas("sprites/sprites.aatls");
        Log.info("Loaded @ sprites",Core.atlas.getRegions().size);
        Core.batch =(Batch) new SpriteBatch();
        Core.camera = new Camera();
        Core.camera.position.set(Core.camera.project(0, 0));
        Vars.world=new World();
        add(new WorldRenderer());
    }
}
