package ru.qs.edu.units;

public class Rogue extends Unit {
    private int dodge;

    public Rogue(String name, int hp, int dodge) {
        super(name, hp);
        this.dodge = dodge;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Dodges left: " + dodge);
    }

    public void getDmg(int dmg) {
        if (dodge > 0) {
            hp = hp;
            dodge--;
        } else {
            hp -= dmg * 2;
        }
    }

    public void attack(Mage mage) {
        mage.getDmg(15);
    }

    public void attack(Warrior warrior) {
        warrior.getDmg(15);
    }
    public void attack (Rogue rogue) {
        rogue.getDmg(15);

    }
}

