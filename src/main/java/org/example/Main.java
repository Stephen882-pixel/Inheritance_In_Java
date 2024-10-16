package org.example;

public class Main {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        Nokia n = new Nokia();
        Xiaomi x = new Xiaomi();
        s.setColor(" Black ");
        s.setCost(30000);
        s.setRAM("  4GB " );
        s.setAndroid_version("Android Pie");// Creating a new object

        n.setColor(" White ");
        n.setCost(25000);
        n.setRAM("  2GB ");
        n.setAndroid_version(" Android Marshmelow ");

        x.setColor(" Red ");
        x.setCost(35000);
        x.setRAM(" 6GB ");
        x.setAndroid_version(" Android Kitkat ");


        //System.out.println(" Samsung android version: " + s.getAndroid_version());
        System.out.println(" Samsung mobile details :  ");
        System.out.println(" The cost is: " + s.getCost() );
        System.out.println(" The Color is: " + s.getColor() );
        System.out.println(" The RAM is: " + s.getRAM() );
        System.out.println(" Android version: " + s.getAndroid_version());

        System.out.println(" Nokia mobile details :  ");
        System.out.println(" The cost is: " + n.getCost() );
        System.out.println(" The Color is: " + n.getColor() );
        System.out.println(" The RAM is: " + n.getRAM() );
        System.out.println(" Android version: " + n.getAndroid_version());

        System.out.println(" Xiaomi mobile details :  ");
        System.out.println(" The cost is: " + x.getCost() );
        System.out.println(" The Color is: " + x.getColor() );
        System.out.println(" The RAM is: " + x.getRAM() );
        System.out.println(" Android version: " + x.getAndroid_version());
    }
}