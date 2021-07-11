package reiyanoigami.game.items;

import arc.Core;
import arc.graphics.g2d.TextureRegion;

public class Item {
    public String name;
    public float flame = 0f;
    public float radioactive = 0f;
    public float boom = 0f;

    public Item(String name) {
        this.name = name;
    }

    public TextureRegion getTexture() {
        return Core.atlas.find(name);
    }
}
