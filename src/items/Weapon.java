package items;


public class Weapon extends Item {
   private WeaponType type;
   private int damage;
   private double attackSpeed;
   private double weaponDPS;   // Damage per second, this could be rounded to two decimals later

    // There are several types of weapons which exist:
    public enum WeaponType{
        AXE,
        BOW,
        DAGGER,
        HAMMER,
        STAFF,
        SWORD,
        WAND
    }

    public Weapon(String name, Integer levelRequired,Slot slot, WeaponType type,  int damage, double attackSpeed) {
        this.setName(name);
        this.setLevelRequired(levelRequired);
        this.type = type;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.setSlot(Slot.WEAPON);
        this.weaponDPS = damage * attackSpeed;

    }

    public WeaponType getType() {
        return type;
    }

    public double getWeaponDPS() {
        return weaponDPS;
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
