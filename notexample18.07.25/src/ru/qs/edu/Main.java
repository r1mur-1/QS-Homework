package ru.qs.edu;

import ru.qs.edu.units.Mage;
import ru.qs.edu.units.Warrior;
import ru.qs.edu.units.Rogue;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Гэндальф", 50, 20);
        Warrior warrior = new Warrior("Боб", 80, 5);
        Rogue rogue = new Rogue("Roland", 40, 4);

        while (mage.getHp() > 0 && rogue.getHp() > 0) {
            mage.attack(rogue);
            rogue.attack(mage);
        }

        mage.printInfo();
        rogue.printInfo();

        while (warrior.getHp() > 0 && rogue.getHp() > 0) {
            rogue.attack(warrior);
            warrior.attack(rogue);
        }

        warrior.printInfo();
        rogue.printInfo();
    }
}