package reiyanoigami.video;

import arc.ApplicationListener;
import arc.Core;
import arc.files.Fi;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.util.Log;
import reiyanoigami.Vars;
import reiyanoigami.game.Blocks;
import reiyanoigami.game.Tile;

import static arc.Core.camera;

public class WorldRenderer implements ApplicationListener {
    @Override
    public void init() {
        camera.width = Core.graphics.getWidth();
        camera.height = Core.graphics.getHeight();
    }

    @Override
    public void resize(int width, int height) {
        camera.resize(Core.graphics.getWidth(),Core.graphics.getHeight());
    }

    @Override
    public void update() {
        if(Vars.activeState!= Vars.GameState.gameplay){
            //return;
        }
        camera.update();
        Core.graphics.clear(Color.black);
        Draw.proj(camera);
        Draw.reset();
        if (Vars.world!=null) {
            int lX = getXLeftBorder();
            int lY = getYDownBorder();
            for (int x = getXLeftBorder(); x <= getXRightBorder(); x++) {
                for (int y = getYDownBorder(); y <= getYUpBorder(); y++) {
                    if (x < 0 || y < 0 || x > Vars.world.tiles[Vars.world.activeDepth].length || y > Vars.world.tiles[Vars.world.activeDepth][x].length) {
                        continue;
                    }
                    Tile t = Vars.world.tiles[Vars.world.activeDepth][x][y];
                    if(t==null){
                        continue;
                    }
                    int x_draw = lX<0?x+Math.abs(lX):x-lX;
                    if (t.floor != null && t.floor != Blocks.air) {
                        Draw.rect(t.floor.getDrawTexture(), Core.graphics.getWidth()/2f+((x-Vars.playerX/32) * Vars.offset) + Vars.offset / 2f, (y - lY) * Vars.offset + Vars.offset / 2f);
                    }
                    if (t.overlay != null && t.overlay != Blocks.air) {
                        Draw.rect(t.overlay.getDrawTexture(), (x - lX) * Vars.offset + Vars.offset / 2f, (y - lY) * Vars.offset + Vars.offset / 2f);
                    }
                    if (t.block != null && t.block != Blocks.air) {
                        Draw.rect(t.block.getDrawTexture(), (x - lX) * Vars.offset + Vars.offset / 2f, (y - lY) * Vars.offset + Vars.offset / 2f);
                    }
                }
            }
        }
        Draw.flush();
        Draw.reset();
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

    private int getXLeftBorder(){
        return (int)((Vars.playerX-(Core.graphics.getWidth()/2))/Vars.offset);
    }
    private int getXRightBorder(){
        return (int)(((Core.graphics.getWidth()/2)-Vars.playerX)/Vars.offset);
        //((Core.graphics.getWidth()/2)-Vars.playerX)/Vars.offset;
    }
    private int getYDownBorder(){
        return (int)(Vars.playerY-(Core.graphics.getHeight()/2))/Vars.offset;
    }
    private int getYUpBorder(){
        return (int)((Core.graphics.getHeight()/2)-Vars.playerY)/Vars.offset;
    }
}
