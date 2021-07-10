package reiyanoigami.game;

public class Tile {
    protected int x;
    protected int y;

    protected int depth;

    protected Object floor;
    protected Object overlay;
    protected Object block;

    public Tile(int x, int y, int depth, Object floor,Object overlay,Object block){
        this.x=x;
        this.y=y;
        this.depth=depth;
        this.floor=floor;
        this.overlay=overlay;
        this.block=block;
        // TODO: 10.07.2021 Fire tileCreatedEvent
    }

    public void setFloor(Object floor){
        this.floor = floor;
        // TODO: 10.07.2021 Fire FloorChangeEvent
    }
    public void setOverlay(Object overlay){
        this.overlay = overlay;
        // TODO: 10.07.2021 Fire OverlayChangeEvent
    }
    public void setBlock(Object block){
        this.block = block;
        // TODO: 10.07.2021 Fire BlockChangeEvent
    }
}
