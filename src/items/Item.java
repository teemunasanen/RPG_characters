package items;

/*All items have:
        • Name
        • Required level to equip the item.
        • Slot in which the item is equipped.

        There are two types of items which exist:
        • Weapons
        • Armor
*/

public abstract class Item {
    private String name;
    private Integer levelRequired;
    private Slot slot;

    public enum Slot {
        HEAD,
        BODY,
        LEGS,
        WEAPON
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevelRequired() {
        return levelRequired;
    }

    public void setLevelRequired(Integer levelRequired) {
        this.levelRequired = levelRequired;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }
}
