package items;


import attributes.PrimaryAttribute;

public class Armor extends Item {
    private ArmorType type;
    private PrimaryAttribute extraShield;


   // There are several types of Armor that exist:
    public enum ArmorType{
        CLOTH,
        LEATHER,
        MAIL,
        PLATE
    }

    public Armor(String name, Integer levelRequired, Slot slot, ArmorType type, int strength, int dexterity, int intelligence) {
        this.setName(name);
        this.setLevelRequired(levelRequired);
        this.type = type;
        this.setSlot(slot);
        this.extraShield = new PrimaryAttribute(strength, dexterity, intelligence);

    }
}
