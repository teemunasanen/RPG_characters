package main;

    /*
    All characters have the following properties:
        • Name
        • Level
        • Base Primary attributes
        • Total Primary attributes
    */

public abstract class Hero implements Improvable {
    private final String name;
    private int level = 1; // Every hero starts at level 1
    private final String type;

    // Base Primary attributes
    private Attributes base;

    // Total Primary attributes initialized
    private Attributes total = new Attributes(0, 0, 0);
    // private double dps;

    // Constructor with required fields and initializing base attributes
    public Hero(String name, String type, Attributes base) {
        this.name = name;
        this.type = type;
        this.base = base;
    }

    public void setTotalAttributes(int strength, int dexterity, int intelligence) {
        this.total.setStrength(this.base.getStrength() + strength);
        this.total.setDexterity(this.base.getDexterity() + dexterity);
        this.total.setIntelligence(this.base.getIntelligence() + intelligence);
    }

    // Setter for baseAttribute private field values when leveling up
    public void setBaseAttributes(int strength, int dexterity, int intelligence) {
        this.base.setStrength(this.base.getStrength() + strength);
        this.base.setDexterity(this.base.getDexterity() + dexterity);
        this.base.setIntelligence(this.base.getIntelligence() + intelligence);
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public int getLevel() {
        return level;
    }


    @Override
    public String toString() {
        return type + "{" +
                "Hero name='" + name + '\'' +
                ", Hero level=" + level +
                ", Strength=" + base.getStrength() +
                ", Dexterity=" + base.getDexterity() +
                ", Intelligence=" + base.getIntelligence() +
//                ", DPS=" + dps +
                '}';
    }

}
