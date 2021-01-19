package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, enter Archer, Swordsman or Wizard to see stats or type skip to skip this step ");
        Scanner viewStats = new Scanner(System.in);
        String warriorClass = viewStats.nextLine();
        Archer archer = new Archer();
        Swordsman swordsman = new Swordsman();
        Wizard wizard = new Wizard();

        while (!warriorClass.equals("skip")) {
            if (warriorClass.equals("Archer")) {
                System.out.println("Health is " + archer.health);
                System.out.println("Average damage is " + archer.averageDamage);
                System.out.println("Weapon is " + archer.weapon);
                System.out.println("Animal is " + archer.animal);
                System.out.println("Maximum armor is " + archer.maxArmor);

                System.out.println("Enter stop to quit or enter the other class (Swordsman or Wizard)");
                warriorClass = viewStats.nextLine();
                if (warriorClass.equals("stop")) {
                    break;
                }

            } else if (warriorClass.equals("Swordsman")) {
                System.out.println("Health is " + swordsman.health);
                System.out.println("Average damage is " + swordsman.averageDamage);
                System.out.println("Weapon is " + swordsman.weapon);
                System.out.println("Animal is " + swordsman.animal);
                System.out.println("Maximum armor is " + swordsman.maxArmor);

                System.out.println("Enter stop to quit or enter the other class (Archer or Wizard)");
                warriorClass = viewStats.nextLine();
                if (warriorClass.equals("stop")) {
                    break;
                }
            } else if (warriorClass.equals("Wizard")) {
                System.out.println("Health is " + wizard.health);
                System.out.println("Average damage is " + wizard.averageDamage);
                System.out.println("Weapon is " + wizard.weapon);
                System.out.println("Animal is " + wizard.animal);
                System.out.println("Maximum armor is " + wizard.maxArmor);

                System.out.println("Enter stop to quit or enter the other class (Swordsman or Archer)");
                warriorClass = viewStats.nextLine();
                if (warriorClass.equals("stop")) {
                    break;
                }
            }
            else {
                System.out.println("Enter the body part to Attack: head, " +
                        "stomach or leg. Or type skip to skip the hit");
                warriorClass = viewStats.nextLine();
            }

        }

        System.out.println("Please, type Archer, Swordsman or Wizard to choose the class");
        String chosenClass = viewStats.nextLine();

        System.out.println("You've encountered a Dragon. His health is 200");
        if (chosenClass.equals("Archer")){
           while (archer.enemyHealth > 0) {
               archer.attack();
               if (archer.enemyHealth > 0)
               archer.protection();
           }
        }
        else if (chosenClass.equals("Swordsman")){
            while (swordsman.enemyHealth > 0){
                swordsman.attack();
                if (archer.enemyHealth > 0)
                swordsman.protection();
            }
        } else if (chosenClass.equals("Wizard")) {
            while (wizard.enemyHealth > 0){
                wizard.attack();
                if (archer.enemyHealth > 0)
                wizard.protection();
            }
        }
        System.out.println("You won!");

    }
}
