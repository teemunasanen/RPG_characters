package items;

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
