package reiyanoigami;

import arc.util.Log;
import reiyanoigami.game.World;

public class Vars {
    public static GameState activeState = GameState.loading;

    public static World world;

    public static int offset=32;

    public static int screenW=640;
    public static int screenH=480;

    public static int camX;
    public static int camY;

    public static float playerX;
    public static float playerY;

    public enum GameState{
        menu,
        loading,
        gameplay
    }

    public static void loadLogger() {
        String[] stags = { "&lc&fb[D]", "&lb&fb[I]", "&ly&fb[W]", "&lr&fb[E]", "" };
        Log.logger = ((level, text) -> {
            String result = text;
            String rawText = Log.format(stags[level.ordinal()] + "&fr " + text, new Object[0]);
            System.out.println(rawText);
        });
    }
}
