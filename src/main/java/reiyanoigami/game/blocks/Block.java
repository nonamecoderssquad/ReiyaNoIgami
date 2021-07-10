package reiyanoigami.game.blocks;

public class Block {
    public String name;
    public boolean solid = true;
    public boolean synthetic = true;
    public boolean power = false;
    public boolean items = false;
    public int minDepth = 0;
    public int blockSize = 1;
    // TODO: 10.07.2021 Add requested for build Items array

    public Block(String name){
        this.name = name;
    }

    public void onUpdate(){

    }
    public void onItemAccept(){

    }
    public void draw(){

    }
}
