package reiyanoigami.video;

import arc.ApplicationListener;
import arc.Core;
import arc.files.Fi;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.util.Log;
import reiyanoigami.Vars;

import static arc.Core.camera;

public class WorldRenderer implements ApplicationListener {
    @Override
    public void init() {
        camera.width = Core.graphics.getWidth();
        camera.height = Core.graphics.getHeight();
    }

    @Override
    public void resize(int width, int height) {
        camera.resize(width,height);
    }

    @Override
    public void update() {
        if(Vars.activeState!= Vars.GameState.gameplay){
            //return;
        }

        camera.update();
        Core.graphics.clear(Color.white);
        Draw.proj(camera);
        Draw.reset();

        Draw.rect(Core.atlas.find("red"),16,16,32,32);

        Draw.flush();
        Draw.reset();
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }

    @Override
    public void exit() {
        ApplicationListener.super.exit();
    }

    @Override
    public void fileDropped(Fi file) {
        ApplicationListener.super.fileDropped(file);
    }
}
