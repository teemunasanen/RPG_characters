package items;

import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import heroes.Warrior;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ItemTest {
    // 1) If a character tries to equip a high level weapon, InvalidWeaponException should be thrown.
    @Test
    public void equipItem_warriorEquipWrongLevelWeapon_shouldThrowInvalidWeaponException() {
        Warrior warrior = new Warrior("warrior");
        Weapon testWeapon = new Weapon("Common Axe", 2, Item.Slot.WEAPON, Weapon.WeaponType.AXE, 7, 1.1);

        InvalidWeaponException exception = assertThrows(InvalidWeaponException.class, () -> warrior.equipItem(testWeapon));
        String expectedMessage = "Weapon is out of your level! 2 level is required to use this Common Axe";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    // 2) If a character tries to equip a high level armor piece, InvalidArmorException should be thrown.
    @Test
    public void equipItem_warriorEquipWrongLevelArmor_shouldThrowInvalidArmorException() {
        Warrior warrior = new Warrior("warrior");
        Armor testPlateBody = new Armor("Common Plate Body Armor", 2, Item.Slot.BODY, Armor.ArmorType.PLATE, 1, 0, 0);

        InvalidArmorException exception = assertThrows(InvalidArmorException.class, () -> warrior.equipItem(testPlateBody));
        String expectedMessage = "Armor is out of your level! 2 level is required to use this Common Plate Body Armor";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    // 3) If a character tries to equip the wrong weapon type, InvalidWeaponException should be thrown.
    @Test
    public void equipItem_warriorEquipWrongTypeWeapon_shouldThrowInvalidWeaponException() {
        Warrior warrior = new Warrior("warrior");
        Weapon testBow = new Weapon("Common Bow", 1, Item.Slot.WEAPON, Weapon.WeaponType.BOW, 12, 0.8);

        InvalidWeaponException exception = assertThrows(InvalidWeaponException.class, () -> warrior.equipItem(testBow));
        String expectedMessage = "Warrior can't use this type of weapon. AXE, HAMMER or SWORD only.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    // 4) If a character tries to equip the wrong armor type, InvalidArmorException should be thrown.
    @Test
    public void equipItem_warriorEquipWrongTypeArmor_shouldThrowInvalidArmorException() {
        Warrior warrior = new Warrior("warrior");
        Armor testClothHead = new Armor("Common Cloth Head Armor", 1, Item.Slot.HEAD, Armor.ArmorType.CLOTH, 0, 0, 5);


        InvalidArmorException exception = assertThrows(InvalidArmorException.class, () -> warrior.equipItem(testClothHead));
        String expectedMessage = "Warrior can't wear CLOTH type of armour. MAIL or PLATE are wearable.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    //  5) If a character equips a valid weapon, a Boolean true should be returned.
    @Test
    public void equipItem_warriorEquipWeapon_shouldReturnTrue() throws InvalidWeaponException {
        Warrior warrior = new Warrior("warrior");
        Weapon testWeapon = new Weapon("Common Axe", 1, Item.Slot.WEAPON, Weapon.WeaponType.AXE, 7, 1.1);

        boolean actual = warrior.equipItem(testWeapon);

        assertTrue(actual);
    }

    //  6) If a character equips a valid armor piece, a Boolean true should be returned.
    @Test
    public void equipItem_warriorEquipArmor_shouldReturnTrue() throws InvalidArmorException {
        Warrior warrior = new Warrior("warrior");
        Armor testPlateBody = new Armor("Common Plate Body Armor", 1, Item.Slot.BODY, Armor.ArmorType.PLATE, 1, 0, 0);

        boolean actual = warrior.equipItem(testPlateBody);

        assertTrue(actual);
    }

    //  7) Calculate DPS if no weapon is equipped.
    @Test
    public void getHeroDPS_constructedWarrior_shouldReturnExpectedDPS() {
        Warrior warrior = new Warrior("warrior");

        float expected = 1 * (1 + (5 / 100f));
        float actual = warrior.getHeroDPS();

        assertEquals(expected, actual);
    }

    //  8) Calculate DPS with valid weapon equipped.
    @Test
    public void getHeroDPS_warriorWithWeapon_shouldReturnExpectedDPS() throws InvalidWeaponException {
        Warrior warrior = new Warrior("warrior");
        Weapon testWeapon = new Weapon("Common Axe", 1, Item.Slot.WEAPON, Weapon.WeaponType.AXE, 7, 1.1);
        warrior.equipItem(testWeapon);

        float expected = (7 * 1.1f) * (1 + (5 / 100f));
        float actual = warrior.getHeroDPS();

        assertEquals(expected, actual);
    }

    //  9) Calculate DPS with valid weapon and armor equipped.
    @Test
    public void getHeroDPS_warriorWithWeaponAndArmor_shouldReturnExpectedDPS() throws InvalidWeaponException, InvalidArmorException {
        Warrior warrior = new Warrior("warrior");
        Weapon testWeapon = new Weapon("Common Axe", 1, Item.Slot.WEAPON, Weapon.WeaponType.AXE, 7, 1.1);
        Armor testPlateBody = new Armor("Common Plate Body Armor", 1, Item.Slot.BODY, Armor.ArmorType.PLATE, 1, 0, 0);
        warrior.equipItem(testWeapon);
        warrior.equipItem(testPlateBody);

        float expected = (7 * 1.1f) * (1 + ((5 + 1) / 100f));
        float actual = warrior.getHeroDPS();

        assertEquals(expected, actual);
    }
}