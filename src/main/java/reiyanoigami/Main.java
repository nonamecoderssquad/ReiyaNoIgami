package reiyanoigami;

import arc.Files.FileType;
import arc.backend.sdl.SdlApplication;
import arc.backend.sdl.SdlConfig;
import reiyanoigami.game.Blocks;
import reiyanoigami.game.items.Items;
import reiyanoigami.video.GameListener;

public class Main {
    public static void main(String[] args) {
        Vars.loadLogger();
        new Blocks();
        new Items();
        SdlConfig gameConfig = new SdlConfig();
        gameConfig.title = "ReiyaNoIgami";
        gameConfig.setWindowIcon(FileType.internal, "sprites-raw/icon.png");
        gameConfig.maximized = true;
        new SdlApplication(new GameListener(), gameConfig);
    }
}