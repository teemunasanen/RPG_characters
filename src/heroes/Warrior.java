package heroes;

/*    A Warrior begins at level 1 with:
    Strength Dexterity Intelligence
        5         2           1

    Every time a Warrior levels up, they gain:
    Strength Dexterity Intelligence
        3         2           1

    RECALL: Warriors deal increased damage for every point of Strength.*/

import attributes.PrimaryAttribute;
import items.Armor;
import items.Weapon;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name, "Warrior", new PrimaryAttribute(5, 2, 1));
        this.setTotalAttributes();
    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(3, 2, 1);
        this.setTotalAttributes();
    }

    @Override
    public void equipItem(Armor armor) {
        this.getEquipment().put(armor.getSlot(), armor);
    }

    @Override
    public void equipItem(Weapon weapon) {
        this.getEquipment().put(weapon.getSlot(), weapon);
    }


}
