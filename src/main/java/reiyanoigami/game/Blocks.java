package reiyanoigami.game;

import reiyanoigami.game.blocks.Block;
import reiyanoigami.game.blocks.Ore;
import reiyanoigami.game.items.Items;

public class Blocks {
    public static Block sand;
    public static Block stone;
    public static Block grass;
    public static Block air;

    public static Block ironOre;
    public static Block copperOre;
    public static Block titanOre;
    public static Block goldOre;
    public static Block uraniumOre;

    public Blocks() {
        sand = new Block("red") {{
            this.synthetic = false;
        }};
        stone = new Block("yellow") {{
            this.synthetic = false;
        }};
        grass = new Block("blue") {{
            this.synthetic = false;
        }};
        air = new Block("air") {{
            this.synthetic = false;
            this.solid = false;
        }};
        ironOre = new Ore("iron-ore") {{
            minedItem = Items.iron;
        }};
        copperOre = new Ore("copper-ore") {{
            minedItem = Items.iron;
        }};
        titanOre = new Ore("titan-ore") {{
            minedItem = Items.iron;
        }};
        goldOre = new Ore("gold-ore") {{
            minedItem = Items.iron;
        }};
        uraniumOre = new Ore("uranium-ore") {{
            minedItem = Items.iron;
        }};
    }
}
