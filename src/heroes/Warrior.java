package heroes;

/*    A Warrior begins at level 1 with:
    Strength Dexterity Intelligence
        5         2           1

    Every time a Warrior levels up, they gain:
    Strength Dexterity Intelligence
        3         2           1

    RECALL: Warriors deal increased damage for every point of Strength.*/

import attributes.PrimaryAttribute;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
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
    public void equipItem(Armor armor) throws InvalidArmorException {
        if(armor.getLevelRequired() > this.getLevel()){
            throw new InvalidArmorException("Armor is out of your level! " + armor.getLevelRequired() + " level is required to use this " +armor.getName());
        } else if (armor.getType() == Armor.ArmorType.MAIL || armor.getType() == Armor.ArmorType.PLATE) {
            this.getEquipment().put(armor.getSlot(), armor);
        }else{
            throw new InvalidArmorException(this.getType() + " can't wear " + armor.getType() + " type of armour. MAIL or PLATE are wearable.");
        }
    }

    @Override
    public void equipItem(Weapon weapon) throws InvalidWeaponException {
        if(weapon.getLevelRequired() > this.getLevel()){
            throw new InvalidWeaponException("Weapon is out of your level! " + weapon.getLevelRequired() + " level is required to use this " + weapon.getName());
        } else if(weapon.getType() == Weapon.WeaponType.AXE || weapon.getType() == Weapon.WeaponType.HAMMER || weapon.getType() == Weapon.WeaponType.SWORD) {
            this.getEquipment().put(weapon.getSlot(), weapon);
        }else{
            throw new InvalidWeaponException(this.getClass() + " can't use this type of weapon. AXE, HAMMER or SWORD only.");
        }
    }


}
