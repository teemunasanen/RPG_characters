package heroes;

/*A Mage begins at level 1 with:
        Strength Dexterity Intelligence
            1        1           8
        Every time a Mage levels up, they gain:
        Strength Dexterity Intelligence
            1        1           5
        RECALL: Mages deal increased damage for every point of Intelligence.*/

import attributes.PrimaryAttribute;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.Armor;
import items.Weapon;

public class Mage extends Hero {


    public Mage(String name) {
        super(name, "Mage", new PrimaryAttribute(1, 1, 8));
        this.setTotalAttributes(0,0,0);

    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(1, 1, 5);
        this.setTotalAttributes(0,0,0);
    }

    @Override
    public void equipItem(Armor armor) throws InvalidArmorException {
        if(armor.getLevelRequired() > this.getLevel()){
            throw new InvalidArmorException("Armor is out of your level! " + armor.getLevelRequired() + " level is required to use this " +armor.getName());
        } else if (armor.getType() == Armor.ArmorType.CLOTH) {
            this.getEquipment().put(armor.getSlot(), armor);
            this.setTotalAttributes(armor.getExtraShield().getStrength(),armor.getExtraShield().getDexterity(), armor.getExtraShield().getIntelligence());
        }else{
            throw new InvalidArmorException(this.getType() + " can't wear " + armor.getType() + " type of armour. CLOTH is wearable.");
        }

    }

    @Override
    public void equipItem(Weapon weapon) throws InvalidWeaponException {
        if(weapon.getLevelRequired() > this.getLevel()){
            throw new InvalidWeaponException("Weapon is out of your level! " + weapon.getLevelRequired() + " level is required to use this " + weapon.getName());
        } else if(weapon.getType() == Weapon.WeaponType.STAFF || weapon.getType() == Weapon.WeaponType.WAND) {
            this.getEquipment().put(weapon.getSlot(), weapon);
        }else{
            throw new InvalidWeaponException(this.getClass() + " can't use this type of weapon. " + Weapon.WeaponType.STAFF + " or " + Weapon.WeaponType.WAND + " only.");
        }
    }

}
