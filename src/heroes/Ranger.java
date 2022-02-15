package heroes;

/*A Ranger begins at level 1 with:
        Strength Dexterity Intelligence
            1         7          1
        Every time a Ranger levels up, they gain:
        Strength Dexterity Intelligence
            1         5          1
        RECALL: Rangers deal increased damage for every point of Dexterity.*/

import attributes.PrimaryAttribute;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.Armor;
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
    public void equipItem(Armor armor) throws InvalidArmorException {
        if(armor.getLevelRequired() > this.getLevel()){
            throw new InvalidArmorException("Armor is out of your level! " + armor.getLevelRequired() + " level is required to use this " +armor.getName());
        } else if (armor.getType() == Armor.ArmorType.LEATHER || armor.getType() == Armor.ArmorType.MAIL) {
            this.getEquipment().put(armor.getSlot(), armor);
        }else{
            throw new InvalidArmorException(this.getType() + " can't wear " + armor.getType() + " type of armour. LEATHER and MAIL are wearable.");
        }
    }

    @Override
    public void equipItem(Weapon weapon) throws InvalidWeaponException {
        if(weapon.getLevelRequired() > this.getLevel()){
            throw new InvalidWeaponException("Weapon is out of your level! " + weapon.getLevelRequired() + " level is required to use this " + weapon.getName());
        } else if(weapon.getType() == Weapon.WeaponType.BOW) {
            this.getEquipment().put(weapon.getSlot(), weapon);
        }else{
            throw new InvalidWeaponException(this.getClass() + " can't use this type of weapon. BOW only.");
        }

    }

}
