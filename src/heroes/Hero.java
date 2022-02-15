package heroes;

    /*
    All characters have the following properties:
        • Name
        • Level
        • Base Primary attributes
        • Total Primary attributes
    */

import attributes.PrimaryAttribute;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.Armor;
import items.Item;
import items.Weapon;

import java.util.HashMap;

public abstract class Hero {
    private final String name;
    private int level = 1; // Every hero starts at level 1
    private final String type;
    protected int increasedDamageAttribute;

    // Base Primary attributes
    private PrimaryAttribute base;

    // Total Primary attributes initialized (Total attribute = base + attributes from all equipped armor)
    private PrimaryAttribute total = new PrimaryAttribute(0, 0, 0);

    private double heroDPS;

    private HashMap<Item.Slot, Item> equipment = new HashMap<>();

    // Constructor with required fields and initializing base attributes
    public Hero(String name, String type, PrimaryAttribute base) {
        this.name = name;
        this.type = type;
        this.base = base;
    }

    public void setTotalAttributes(int strength, int dexterity, int intelligence) {
        this.total.setStrength(this.base.getStrength() + strength);
        this.total.setDexterity(this.base.getDexterity() + dexterity);
        this.total.setIntelligence(this.base.getIntelligence() + intelligence);
    }

    public PrimaryAttribute getTotal() {
        return total;
    }

    public void setBaseAttributes(int strength, int dexterity, int intelligence) {
        this.base.setStrength(this.base.getStrength() + strength);
        this.base.setDexterity(this.base.getDexterity() + dexterity);
        this.base.setIntelligence(this.base.getIntelligence() + intelligence);
    }

    public HashMap<Item.Slot, Item> getEquipment() {
        return equipment;
    }


    public abstract void levelUp();

    public abstract void equipItem(Armor armor) throws InvalidArmorException;

    public abstract void equipItem(Weapon weapon) throws InvalidWeaponException;

    public String getType() {
        return type;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public float getHeroDPS() {
        Weapon weapon = (Weapon) this.equipment.get(Item.Slot.WEAPON);

        if (weapon == null) {
            this.heroDPS = (1 + (this.increasedDamageAttribute / 100f));
        } else {
            this.heroDPS = weapon.getWeaponDPS() * (1 + (this.increasedDamageAttribute / 100f));
        }

        return (float) heroDPS;
    }


    @Override
    public String toString() {
        return
                "Hero name:" + name + "\n" +
                        "Hero level: " + level + "\n" +
                        "Strength: " + total.getStrength() + "\n" +
                        "Dexterity: " + total.getDexterity() + "\n" +
                        "Intelligence: " + total.getIntelligence() + "\n" +
                        "DPS: " + getHeroDPS();
    }

}
