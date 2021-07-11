package reiyanoigami.game.blocks;

import arc.Core;
import arc.graphics.g2d.TextureRegion;
import reiyanoigami.game.Blocks;
import reiyanoigami.game.Tile;

public class Block {
    public String name;
    public boolean solid = true;
    public boolean synthetic = true;
    public boolean power = false;
    public boolean items = false;
    public int minDepth = 0;
    public int blockSize = 1;
    // TODO: 10.07.2021 Add requested for build Items array

    public Block(String name) {
        this.name = name;
    }

    public void onUpdate() {

    }

    public void onItemAccept() {

    }

    public boolean canPlaceOn(Tile target){
        if(minDepth<target.getDepth()){
            return false;
        }
        // TODO: 11.07.2021 Add water checking
        if(target.block==null||target.block== Blocks.air){
            return true;
        }
        return false;
    }

    public boolean canDestroy(){
        return synthetic&&solid;
    }

    public TextureRegion getDrawTexture() {
        return Core.atlas.find(this.name);
    }
}
