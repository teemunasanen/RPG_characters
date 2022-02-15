package main;

import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import heroes.Mage;
import heroes.Ranger;
import heroes.Rogue;
import heroes.Warrior;
import items.Armor;
import items.Item;
import items.Weapon;

public class Main {

    public static void main(String[] args) throws InvalidArmorException, InvalidWeaponException {
        Mage mage = new Mage("mage");
        Ranger ranger = new Ranger("ranger");
        Rogue rogue = new Rogue("rogue");
        Warrior warrior = new Warrior("warrior");

        System.out.println(ranger);
        System.out.println(mage);
        System.out.println(rogue);
        System.out.println(warrior);

        System.out.println();

        mage.levelUp();
        ranger.levelUp();
        rogue.levelUp();
        warrior.levelUp();

        System.out.println(ranger);
        System.out.println(mage);
        System.out.println(rogue);
        System.out.println(warrior);

        Weapon testWeapon = new Weapon("Common Axe", 1, Item.Slot.WEAPON, Weapon.WeaponType.AXE, 7, 1.1);
        Armor testPlateBody = new Armor("Common Plate Body Armor", 1, Item.Slot.BODY, Armor.ArmorType.PLATE,1,1,1 );
        Weapon testBow = new Weapon("Common Bow", 1, Item.Slot.WEAPON, Weapon.WeaponType.BOW, 12, 0.8);
        Armor testClothHead = new Armor("Common Cloth Head Armor", 1, Item.Slot.HEAD, Armor.ArmorType.CLOTH,1,1,1);

        warrior.equipItem(testPlateBody);
        ranger.equipItem(testBow);
        mage.equipItem(testClothHead);
        warrior.equipItem(testWeapon);

        System.out.println(mage.getEquipment());
        System.out.println(ranger);
        System.out.println(mage);
        System.out.println(rogue);
        System.out.println(warrior);
        System.out.println(testWeapon.getWeaponDPS());
        System.out.println(testBow.getWeaponDPS());




    }
}
