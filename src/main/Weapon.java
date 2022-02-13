package main;


public class Weapon extends Item {
   private WeaponType type;
   private int damage;
   private double attackSpeed;

    // There are several types of weapons which exist:
    enum WeaponType{
        AXE,
        BOW,
        DAGGER,
        HAMMER,
        STAFF,
        SWORD,
        WAND
    }

    public Weapon(String name, Integer levelRequired, WeaponType type, int damage, double attackSpeed) {
        super(name, levelRequired);
        this.type = type;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}
