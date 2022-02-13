package main;

/*    A Rogue begins at level 1 with:
    Strength Dexterity Intelligence
        2        6           1
    Every time a Rogue levels up, they gain:
    Strength Dexterity Intelligence
        1        4           1
    RECALL: Rogues deal increased damage for every point of Dexterity*/

public class Rogue extends Hero{

    public Rogue(String name) {
        super(name, "Rogue",new Attributes(2,6,1));

    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(1,4,1);
    }
}
