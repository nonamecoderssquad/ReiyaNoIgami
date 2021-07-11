package reiyanoigami.game;

import reiyanoigami.game.blocks.Block;

public class Blocks {
    public static Block sand;
    public static Block stone;
    public static Block grass;
    public static Block air;

    public Blocks(){
        sand=new Block("red"){{
            this.synthetic=false;
        }};
        stone=new Block("yellow"){{
            this.synthetic=false;
        }};
        grass=new Block("blue"){{
            this.synthetic=false;
        }};
        air=new Block("air"){{
            this.synthetic=false;
            this.solid=false;
        }};
    }
}
