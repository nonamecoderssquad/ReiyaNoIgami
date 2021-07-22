package reiyanoigami.input;

import arc.Core;
import arc.input.KeyCode;
import reiyanoigami.Vars;

public class InputHandler {
    public static void playerMovement() {
        if (Core.input.keyDown(KeyCode.w)) {
            for (int i = 0; i < 10; i++) {
                Vars.playerY += 0.1;
            }
        }
        if (Core.input.keyDown(KeyCode.s)) {
            for (int i = 0; i < 10; i++) {
                Vars.playerY -= 0.1;
            }
        }
        if (Core.input.keyDown(KeyCode.d)) {
            for (int i = 0; i < 10; i++) {
                Vars.playerX += 0.1;
            }
        }
        if (Core.input.keyDown(KeyCode.a)) {
            for (int i = 0; i < 10; i++) {
                Vars.playerX -= 0.1;
            }
        }

        if (Vars.playerX > Vars.world.width * Vars.offset) {
            Vars.playerX = Vars.world.width * Vars.offset;
        }
        if (Vars.playerY > Vars.world.height * Vars.offset) {
            Vars.playerY = Vars.world.height * Vars.offset;
        }
        if (Vars.playerX < 0) {
            Vars.playerX = 0;
        }
        if (Vars.playerY < 0) {
            Vars.playerY = 0;
        }
    }
}
