package main;

/*    A Warrior begins at level 1 with:
    Strength Dexterity Intelligence
        5         2           1

    Every time a Warrior levels up, they gain:
    Strength Dexterity Intelligence
        3         2           1

    RECALL: Warriors deal increased damage for every point of Strength.*/

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name, "Warrior", new Attributes(5, 2, 1));
    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(3, 2, 1);
    }
}
