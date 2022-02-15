package heroes;

/*    A Rogue begins at level 1 with:
    Strength Dexterity Intelligence
        2        6           1
    Every time a Rogue levels up, they gain:
    Strength Dexterity Intelligence
        1        4           1
    RECALL: Rogues deal increased damage for every point of Dexterity*/

import attributes.PrimaryAttribute;
import items.Armor;
import items.Weapon;

public class Rogue extends Hero {

    public Rogue(String name) {
        super(name, "Rogue", new PrimaryAttribute(2, 6, 1));
        this.setTotalAttributes();
    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(1, 4, 1);
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
