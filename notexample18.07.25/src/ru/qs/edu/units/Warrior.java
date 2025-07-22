package ru.qs.edu.units;

public class Warrior extends Unit {
    private int rage;

    public Warrior(String name, int hp, int rage) {
        super(name, hp);
        this.rage = rage;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Rage:" + rage);
    }

    public void getDmg(int dmg) {
        if (rage > 0) {
            hp -= dmg * 2;
            rage++;
        } else {
            hp -= dmg;
        }
    }

    public void attack(Warrior warrior) {
        if (rage > 0) {
            warrior.getDmg(35);
            rage = rage - 2;
        } else {
            warrior.getDmg(10);
        }
    }

    public void attack(Mage mage) {
        if (rage > 0) {
            mage.getDmg(35);
            rage = rage - 2;
        } else {
            mage.getDmg(10);
        }
    }

    public void attack(Rogue rogue) {
        if (rage > 0) {
            rogue.getDmg(35);
            rage = rage - 2;
        } else {
            rogue.getDmg(10);
        }
    }
}
