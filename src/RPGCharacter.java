import sun.security.provider.ConfigFile;

import javax.swing.*;

public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
    public static void main(String[] args) {
     String name;
     String str;
     String dex;
     String wis;
     String intel;
     String con;
     String cha;
     int damage, health, mana, spellStrength;

     name = JOptionPane.showInputDialog("enter your name");
     str = JOptionPane.showInputDialog("enter your strength");
     dex = JOptionPane.showInputDialog("enter your dexterity");
     wis = JOptionPane.showInputDialog("enter your wisdom");
     intel = JOptionPane.showInputDialog("enter your intelligence");
     con= JOptionPane.showInputDialog("enter your constitution");
     cha = JOptionPane.showInputDialog("enter your charisma");

     Integer.parseInt(str);
     Integer.parseInt(dex);
     Integer.parseInt(intel);
     Integer.parseInt(con);
     Integer.parseInt(cha);
     Integer.parseInt(wis);

     mana = wis* 10;
     spellStrength = wis * intel;
     damage = str* 10;
     health = con*13;








    }














}
