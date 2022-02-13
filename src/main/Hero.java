package main;

public abstract class Hero {
    protected String name;
    protected int level;

    // Base Primary attributes
    protected int strength;
    protected int dexterity;
    protected int intelligence;

    // Total Primary attributes
//    protected double dps;


    public Hero(String name, int level, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "Hero name='" + name + '\'' +
                ", Hero level=" + level +
                ", Strength=" + strength +
                ", Dexterity=" + dexterity +
                ", Intelligence=" + intelligence +
//                ", DPS=" + dps +
                '}';
    }
}
