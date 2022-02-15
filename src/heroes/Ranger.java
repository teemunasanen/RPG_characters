package heroes;

/*A Ranger begins at level 1 with:
        Strength Dexterity Intelligence
            1         7          1
        Every time a Ranger levels up, they gain:
        Strength Dexterity Intelligence
            1         5          1
        RECALL: Rangers deal increased damage for every point of Dexterity.*/

import attributes.PrimaryAttribute;
import items.Armor;
import items.Item;
import items.Weapon;

public class Ranger extends Hero {

    public Ranger(String name) {
        super(name, "Ranger", new PrimaryAttribute(1, 7, 1));
        this.setTotalAttributes();
    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(1, 5, 1);
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
