package main;

/*A Mage begins at level 1 with:
        Strength Dexterity Intelligence
            1        1           8
        Every time a Mage levels up, they gain:
        Strength Dexterity Intelligence
            1        1           5
        RECALL: Mages deal increased damage for every point of Intelligence.*/

public class Mage extends Hero {

    public Mage(String name) {
        super(name, "Mage", new Attributes(1, 1, 8));
    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(1, 1, 5);
    }
}
