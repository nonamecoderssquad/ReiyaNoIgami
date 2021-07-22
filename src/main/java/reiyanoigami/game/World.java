package reiyanoigami.game;

import arc.struct.Seq;
import reiyanoigami.game.blocks.Block;

public class World {
    public Tile[][][] tiles;
    public int lastUnlockedDepth;
    public int activeDepth;
    public int width;
    public int height;

    public World(int maxDepth, int x_size, int y_size) {
        tiles = new Tile[maxDepth][x_size][y_size];
        width = x_size;
        height = y_size;
        lastUnlockedDepth = 0;
        activeDepth = 0;
    }

    public World() {
        Seq<Block> tmp = new Seq<>();
        tmp.add(Blocks.grass);
        tmp.add(Blocks.sand);
        tmp.add(Blocks.stone);
        width = 25;
        height = 25;
        tiles = new Tile[3][25][25];
        for (int d = 0; d < 3; d++) {
            for (int x = 0; x < 25; x++) {
                for (int y = 0; y < 25; y++) {
                    tmp.shuffle();
                    tiles[d][x][y] = new Tile(x, y, d, tmp.first(), Blocks.air, Blocks.air);
                }
            }
        }
    }
}
