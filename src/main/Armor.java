package main;



public class Armor extends Item {
    private ArmorType type;
    //private Attributes extraShield;


   // There are several types of Armor that exist:
    enum ArmorType{
        CLOTH,
        LEATHER,
        MAIL,
        PLATE
    }

    public Armor(String name, Integer levelRequired, ArmorType type) {
        super(name, levelRequired);
        this.type = type;

    }
}
