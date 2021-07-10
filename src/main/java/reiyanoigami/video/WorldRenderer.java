package reiyanoigami.video;

import arc.ApplicationListener;
import arc.files.Fi;
import arc.util.Log;

public class WorldRenderer implements ApplicationListener {
    @Override
    public void init() {
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void update() {
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
