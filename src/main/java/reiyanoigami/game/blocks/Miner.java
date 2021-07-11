package reiyanoigami.game.blocks;

import reiyanoigami.game.Tile;

public class Miner extends Block {
    public long miningTime;
    public int capacity;
    public int miningLevel;

    public Miner(String name) {
        super(name);
    }

    @Override
    public boolean canPlaceOn(Tile target) {
        boolean answer = super.canPlaceOn(target);
        answer=answer&&(target.overlay instanceof Ore&&miningLevel>=((Ore) target.overlay).hardest);
        return answer;
    }
}
