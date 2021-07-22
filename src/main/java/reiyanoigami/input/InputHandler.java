package reiyanoigami.input;

import arc.Core;
import arc.input.KeyCode;
import reiyanoigami.Vars;

public class InputHandler {
    public void playerMovement() {
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
        if (Core.input.keyRelease(KeyCode.w)) {
            for(int i = 0; i < 5; i++) {
                Vars.playerY += 0.2;
            }
            for(int i = 0; i < 5; i++) {
                Vars.playerY -= 0.2;
            }
        }
        if (Core.input.keyRelease(KeyCode.s)) {
            for(int i = 0; i < 5; i++) {
                Vars.playerY -= 0.2;
            }
            for(int i = 0; i < 5; i++) {
                Vars.playerY += 0.2;
            }
        }
        if (Core.input.keyRelease(KeyCode.d)) {
            for(int i = 0; i < 5; i++) {
                Vars.playerX += 0.2;
            }
            for(int i = 0; i < 5; i++) {
                Vars.playerX -= 0.2;
            }
        }
        if (Core.input.keyRelease(KeyCode.a)) {
            for(int i = 0; i < 5; i++) {
                Vars.playerX -= 0.2;
            }
            for(int i = 0; i < 5; i++) {
                Vars.playerX += 0.2;
            }
        }
    }
}
