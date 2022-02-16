package heroes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HeroTest {
// 1) A character is level 1 when created.
    @Test
    public void getLevel_constructedMage_shouldReturnLevel1(){
        Mage mage = new Mage("mage");
        int expected = 1;
        int actual = mage.getLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void getLevel_constructedRanger_shouldReturnLevel1(){
        Ranger ranger = new Ranger("ranger");
        int expected = 1;
        int actual = ranger.getLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void getLevel_constructedRogue_shouldReturnLevel1(){
        Rogue rogue = new Rogue("rogue");
        int expected = 1;
        int actual = rogue.getLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void getLevel_constructedWarrior_shouldReturnLevel1(){
        Warrior warrior = new Warrior("warrior");
        int expected = 1;
        int actual = warrior.getLevel();

        assertEquals(expected, actual);
    }
// 2) When a character gains a level, it should be level 2.
    @Test
    public void levelUp_levelingUpMage_shouldReturnLevel2(){
        Mage mage = new Mage("mage");
        mage.levelUp();
        int expected = 2;
        int actual = mage.getLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void levelUp_levelingUpRanger_shouldReturnLevel2(){
        Ranger ranger = new Ranger("ranger");
        ranger.levelUp();
        int expected = 2;
        int actual = ranger.getLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void levelUp_levelingUpRogue_shouldReturnLevel2(){
        Rogue rogue = new Rogue("rogue");
        rogue.levelUp();
        int expected = 2;
        int actual = rogue.getLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void levelUp_levelingUpWarrior_shouldReturnLevel2(){
        Warrior warrior = new Warrior("warrior");
        warrior.levelUp();
        int expected = 2;
        int actual = warrior.getLevel();

        assertEquals(expected, actual);
    }
// 3) Each character class is created with the proper default attributes.
@Test
public void PrimaryAttributeBase_constructedMage_shouldReturnDefaultAttributeValues(){
    Mage mage = new Mage("mage");
    int strength = 1;
    int dexterity = 1;
    int intelligence = 8;

    int actualStrength = mage.getTotal().getStrength();
    int actualDexterity = mage.getTotal().getDexterity();
    int actualIntelligence = mage.getTotal().getIntelligence();

    assertEquals(strength, actualStrength);
    assertEquals(dexterity, actualDexterity);
    assertEquals(intelligence, actualIntelligence);
}

    @Test
    public void PrimaryAttributeBase_constructedRanger_shouldReturnDefaultAttributeValues(){
        Ranger ranger = new Ranger("ranger");
        int strength = 1;
        int dexterity = 7;
        int intelligence = 1;

        int actualStrength = ranger.getTotal().getStrength();
        int actualDexterity = ranger.getTotal().getDexterity();
        int actualIntelligence = ranger.getTotal().getIntelligence();

        assertEquals(strength, actualStrength);
        assertEquals(dexterity, actualDexterity);
        assertEquals(intelligence, actualIntelligence);
    }

    @Test
    public void PrimaryAttributeBase_constructedRogue_shouldReturnDefaultAttributeValues(){
        Rogue rogue = new Rogue("rogue");
        int strength = 2;
        int dexterity = 6;
        int intelligence = 1;

        int actualStrength = rogue.getTotal().getStrength();
        int actualDexterity = rogue.getTotal().getDexterity();
        int actualIntelligence = rogue.getTotal().getIntelligence();

        assertEquals(strength, actualStrength);
        assertEquals(dexterity, actualDexterity);
        assertEquals(intelligence, actualIntelligence);
    }

    @Test
    public void PrimaryAttributeBase_constructedWarrior_shouldReturnDefaultAttributeValues(){
        Warrior warrior = new Warrior("warrior");
        int strength = 5;
        int dexterity = 2;
        int intelligence = 1;

        int actualStrength = warrior.getTotal().getStrength();
        int actualDexterity = warrior.getTotal().getDexterity();
        int actualIntelligence = warrior.getTotal().getIntelligence();

        assertEquals(strength, actualStrength);
        assertEquals(dexterity, actualDexterity);
        assertEquals(intelligence, actualIntelligence);
    }

   // 4) Each character class has their attributes increased when leveling up.

    @Test
    public void PrimaryAttributeTotal_levelingUpMage_shouldReturnLeveledAttributeValues(){
        Mage mage = new Mage("mage");
        mage.levelUp();
        int strength = 2;
        int dexterity = 2;
        int intelligence = 13;

        int actualStrength = mage.getTotal().getStrength();
        int actualDexterity = mage.getTotal().getDexterity();
        int actualIntelligence = mage.getTotal().getIntelligence();

        assertEquals(strength, actualStrength);
        assertEquals(dexterity, actualDexterity);
        assertEquals(intelligence, actualIntelligence);
    }

    @Test
    public void PrimaryAttributeTotal_levelingUpRanger_shouldReturnLeveledAttributeValues(){
        Ranger ranger = new Ranger("ranger");
        ranger.levelUp();
        int strength = 2;
        int dexterity = 12;
        int intelligence = 2;

        int actualStrength = ranger.getTotal().getStrength();
        int actualDexterity = ranger.getTotal().getDexterity();
        int actualIntelligence = ranger.getTotal().getIntelligence();

        assertEquals(strength, actualStrength);
        assertEquals(dexterity, actualDexterity);
        assertEquals(intelligence, actualIntelligence);
    }

    @Test
    public void PrimaryAttributeTotal_levelingUpRogue_shouldReturnLeveledAttributeValues(){
        Rogue rogue = new Rogue("rogue");
        rogue.levelUp();
        int strength = 3;
        int dexterity = 10;
        int intelligence = 2;

        int actualStrength = rogue.getTotal().getStrength();
        int actualDexterity = rogue.getTotal().getDexterity();
        int actualIntelligence = rogue.getTotal().getIntelligence();

        assertEquals(strength, actualStrength);
        assertEquals(dexterity, actualDexterity);
        assertEquals(intelligence, actualIntelligence);
    }

    @Test
    public void PrimaryAttributeTotal_levelingUpWarrior_shouldReturnLeveledAttributeValues(){
        Warrior warrior = new Warrior("warrior");
        warrior.levelUp();
        int strength = 8;
        int dexterity = 4;
        int intelligence = 2;

        int actualStrength = warrior.getTotal().getStrength();
        int actualDexterity = warrior.getTotal().getDexterity();
        int actualIntelligence = warrior.getTotal().getIntelligence();

        assertEquals(strength, actualStrength);
        assertEquals(dexterity, actualDexterity);
        assertEquals(intelligence, actualIntelligence);
    }
}