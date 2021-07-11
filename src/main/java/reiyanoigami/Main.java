package reiyanoigami;

import arc.backend.sdl.*;
import arc.Files.*;
import reiyanoigami.video.GameListener;

public class Main {
    public static void main(String[] args){
        Vars.loadLogger();
        SdlConfig gameConfig = new SdlConfig();
        String[] filePath = new String[1];
        filePath[0] = "sprites-raw/icon.png";
        gameConfig.title = "ReiyaNoIgami";
        gameConfig.windowIconFileType = FileType.internal;
        gameConfig.windowIconPaths = filePath;
        new SdlApplication(new GameListener(),gameConfig);
    }
}