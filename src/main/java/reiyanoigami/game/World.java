package reiyanoigami.game;

public class World {
    public Tile[][][] tiles;
    public int lastUnlockedDepth;
    public int activeDepth;

    public World(int maxDepth, int x_size,int y_size){
        tiles = new Tile[maxDepth][x_size][y_size];
        lastUnlockedDepth = 0;
        activeDepth = 0;
    }
}
