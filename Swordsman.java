package com.company;

import java.util.Scanner;

public class Swordsman {
    public int health = 200;
    public float averageDamage = 36.6f;
    public int maxArmor = 20;
    public String weapon = "Sword";
    public String animal = "Horse";
    int enemyHealth = 200;

    public void attack (){
        System.out.println("Enter the body part to Attack: head, " +
                "stomach or leg. Or type skip to skip the hit");
        Scanner inAttack = new Scanner(System.in);
        String bodyPartAttack = inAttack.nextLine();

        while (!bodyPartAttack.equals("skip")) {

            if ("head".equals(bodyPartAttack)) {
                int damageInAttack = 50;
                enemyHealth = enemyHealth - damageInAttack;
                System.out.println("You dealt " + damageInAttack + "xp damage to the enemy");
                if (enemyHealth <= 0) {
                    enemyHealth = 0;
                }
                System.out.println("Dragon's health now is " + enemyHealth);
                System.out.println();
                break;
            } else if ("stomach".equals(bodyPartAttack)) {
                int damageInAttack = 40;
                enemyHealth = enemyHealth - damageInAttack;
                System.out.println("You dealt " + damageInAttack + "xp damage to the enemy");
                if (enemyHealth <= 0) {
                    enemyHealth = 0;
                }
                System.out.println("Dragon's health now is " + enemyHealth);
                System.out.println();
                break;
            } else if ("leg".equals(bodyPartAttack)) {
                int damageInAttack = 20;
                enemyHealth = enemyHealth - damageInAttack;
                System.out.println("You dealt " + damageInAttack + "xp damage to the enemy");
                if (enemyHealth <= 0) {
                    enemyHealth = 0;
                }
                System.out.println("Dragon's health now is " + enemyHealth);
                System.out.println();
                break;
            } else {
                System.out.println("Please, enter the body part to attack among head, " +
                        "stomach or leg or type skip to skip the hit");
                bodyPartAttack = inAttack.nextLine();
            }
        }
    }

    public void protection () {

        int damageInProtection;
        System.out.println("Enter the body part to Protect: head, " +
                "stomach or leg. Or type skip to skip protection");
        Scanner inProtect = new Scanner(System.in);
        String bodyPartProtect = inProtect.nextLine();

        while (!bodyPartProtect.equals("skip")) {

            if ("head".equals(bodyPartProtect)) {
                damageInProtection = 50 - maxArmor;
                System.out.println("You were damaged by " + damageInProtection + " xp");
                health = health - damageInProtection;
                if (health <= 0) {
                    health = 0;
                }
                System.out.println("Your health now is " + health);
                if(health <= 0){
                    System.out.println("You need to heal. Type amount of xp to drink potion for healing");
                    health = health + inProtect.nextInt();
                    System.out.println("Your health now is " + health);
                }
                System.out.println();
                break;
            } else if ("stomach".equals(bodyPartProtect)) {
                damageInProtection = 70 - maxArmor;
                System.out.println("You were damaged by " + damageInProtection + " xp");
                health = health - damageInProtection;
                if (health <= 0) {
                    health = 0;
                }
                System.out.println("Your health now is " + health);
                if(health <= 0){
                    System.out.println("You need to heal. Type amount of xp to drink potion for healing");
                    health = health + inProtect.nextInt();
                    System.out.println("Your health now is " + health);
                }
                System.out.println();
                break;
            } else if ("leg".equals(bodyPartProtect)) {
                damageInProtection = 90 - maxArmor;
                System.out.println("You were damaged by " + damageInProtection + " xp");
                health = health - damageInProtection;
                if (health <= 0) {
                    health = 0;
                }
                System.out.println("Your health now is " + health);
                if(health <= 0){
                    System.out.println("You need to heal. Type amount of xp to drink potion for healing");
                    health = health + inProtect.nextInt();
                    System.out.println("Your health now is " + health);
                }
                System.out.println();
                break;
            } else {
                System.out.println("Enter the body part to Protect: head, " +
                        "stomach or leg. Or type skip to skip protection");
                bodyPartProtect = inProtect.nextLine();
            }
        }
    }

    //public void work (String workType){

    //}


    // public void healing ()



}
