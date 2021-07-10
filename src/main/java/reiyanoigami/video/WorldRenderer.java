package reiyanoigami.video;

import arc.ApplicationListener;
import arc.files.Fi;
import reiyanoigami.Vars;

public class WorldRenderer implements ApplicationListener {
    @Override
    public void init() {
    }

    @Override
    public void resize(int width, int height) {
        Vars.screenW=width;
        Vars.screenH=height;
    }

    @Override
    public void update() {
        if(Vars.activeState!= Vars.GameState.gameplay){
            return;
        }
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
