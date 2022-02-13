package main;

public class Main {

    public static void main(String[] args) {
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
    }
}
