package reiyanoigami;

import arc.Files.FileType;
import arc.backend.sdl.SdlApplication;
import arc.backend.sdl.SdlConfig;
import reiyanoigami.game.Blocks;
import reiyanoigami.video.GameListener;

public class Main {
    public static void main(String[] args) {
        Vars.loadLogger();
        new Blocks();
        SdlConfig gameConfig = new SdlConfig();
        gameConfig.title = "ReiyaNoIgami";
        gameConfig.windowIconFileType = FileType.internal;
        gameConfig.windowIconPaths = new String[]{"sprites-raw/icon.png"};
        new SdlApplication(new GameListener(), gameConfig);
    }
}