package reiyanoigami.game.blocks;

import reiyanoigami.game.items.Item;

public class Ore extends Block{
    public int hardest = 0;
    public Item minedItem;
    public Ore(String name) {
        super(name);
    }
}
