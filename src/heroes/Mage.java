package heroes;

/*A Mage begins at level 1 with:
        Strength Dexterity Intelligence
            1        1           8
        Every time a Mage levels up, they gain:
        Strength Dexterity Intelligence
            1        1           5
        RECALL: Mages deal increased damage for every point of Intelligence.*/

import attributes.PrimaryAttribute;
import items.Armor;
import items.Weapon;

public class Mage extends Hero {


    public Mage(String name) {
        super(name, "Mage", new PrimaryAttribute(1, 1, 8));
        this.setTotalAttributes();

    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(1, 1, 5);
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
