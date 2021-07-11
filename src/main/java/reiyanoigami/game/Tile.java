package reiyanoigami.game;

import reiyanoigami.game.blocks.Block;

public class Tile {
    protected int x;
    protected int y;

    protected int depth;

    public Block floor;
    public Block overlay;
    public Block block;

    public Tile(int x, int y, int depth, Block floor,Block overlay,Block block){
        this.x=x;
        this.y=y;
        this.depth=depth;
        this.floor=floor;
        this.overlay=overlay;
        this.block=block;
        // TODO: 10.07.2021 Fire tileCreatedEvent
    }

    public void setFloor(Block floor){
        this.floor = floor;
        // TODO: 10.07.2021 Fire FloorChangeEvent
    }
    public void setOverlay(Block overlay){
        this.overlay = overlay;
        // TODO: 10.07.2021 Fire OverlayChangeEvent
    }
    public void setBlock(Block block){
        this.block = block;
        // TODO: 10.07.2021 Fire BlockChangeEvent
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getDepth(){
        return depth;
    }
}
