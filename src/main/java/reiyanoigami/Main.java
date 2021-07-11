package reiyanoigami;

import arc.backend.sdl.*;
import reiyanoigami.game.Blocks;
import reiyanoigami.video.GameListener;

public class Main {
    public static void main(String[] args){
        Vars.loadLogger();
        new Blocks();
        SdlConfig gameConfig = new SdlConfig();
        gameConfig.title = "ReiyaNoIgami";
        new SdlApplication(new GameListener(),gameConfig);
    }
}