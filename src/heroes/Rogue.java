package heroes;

import attributes.PrimaryAttribute;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.Armor;
import items.Weapon;

public class Rogue extends Hero {

    public Rogue(String name) {
        super(name, "Rogue", new PrimaryAttribute(2, 6, 1));
        this.setTotalAttributes(0, 0, 0);// updates total Attributes
        this.increasedDamageAttribute = this.getTotal().getDexterity();
    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setBaseAttributes(1, 4, 1);
        this.setTotalAttributes(0, 0, 0);// updates total Attributes
        this.increasedDamageAttribute = this.getTotal().getDexterity();
    }

    @Override
    public boolean equipItem(Armor armor) throws InvalidArmorException {
        if (armor.getLevelRequired() > this.getLevel()) {
            throw new InvalidArmorException("Armor is out of your level! " + armor.getLevelRequired() + " level is required to use this " + armor.getName());
        } else if (armor.getType() == Armor.ArmorType.LEATHER || armor.getType() == Armor.ArmorType.MAIL) {
            this.getEquipment().put(armor.getSlot(), armor);
            this.setTotalAttributes(armor.getExtraShield().getStrength(), armor.getExtraShield().getDexterity(), armor.getExtraShield().getIntelligence());
            this.increasedDamageAttribute = this.getTotal().getDexterity();
            return true;
        } else {
            throw new InvalidArmorException(this.getType() + " can't wear " + armor.getType() + " type of armour. LEATHER and MAIL are wearable.");
        }
    }

    @Override
    public boolean equipItem(Weapon weapon) throws InvalidWeaponException {
        if (weapon.getLevelRequired() > this.getLevel()) {
            throw new InvalidWeaponException("Weapon is out of your level! " + weapon.getLevelRequired() + " level is required to use this " + weapon.getName());
        } else if (weapon.getType() == Weapon.WeaponType.DAGGER || weapon.getType() == Weapon.WeaponType.SWORD) {
            this.getEquipment().put(weapon.getSlot(), weapon);
            return true;
        } else {
            throw new InvalidWeaponException(this.getClass() + " can't use this type of weapon. DAGGER or SWORD only.");
        }

    }

}
