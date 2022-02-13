package main;

/*A Ranger begins at level 1 with:
        Strength Dexterity Intelligence
            1         7          1
        Every time a Ranger levels up, they gain:
        Strength Dexterity Intelligence
            1         5          1
        RECALL: Rangers deal increased damage for every point of Dexterity.*/

public class Ranger extends Hero{

    public Ranger(String name) {
        super(name, "Ranger", new Attributes(1,7,1));

    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(1,5,1);
    }
}
