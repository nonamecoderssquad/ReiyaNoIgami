package reiyanoigami.game.items;

public class Items {
    public static Item iron;
    public static Item copper;
    public static Item titan;
    public static Item gold;
    public static Item uranium;

    public Items(){
        iron = new Item("iron");
        copper = new Item("copper");
        titan = new Item("titan");
        gold = new Item("gold");
        uranium = new Item("uranium"){{
                radioactive=1f;
        }};
    }
}
