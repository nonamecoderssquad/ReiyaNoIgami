package reiyanoigami;

import arc.backend.sdl.*;
import reiyanoigami.video.GameListener;

public class Main {
    public static void main(String[] args){
        new SdlApplication(new GameListener(),new SdlConfig());
    }
}
