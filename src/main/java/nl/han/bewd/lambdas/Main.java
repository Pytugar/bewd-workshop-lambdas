package nl.han.bewd.lambdas;

import nl.han.bewd.lambdas.reis.*;

import java.util.Random;

public class Main {
    /*
    Een Reis wordt gemaakt met een enkel vervoermiddel. De reistijd kan door middel van een simulatie van de
    reis worden berekend. Hierbij kan onderscheid gemaakt worden of de reis tijdens de spits of buiten de spits is.
     */
    public static void main(String[] args) {
        System.out.println("Buiten spits met fiets");
        Reis mijnReis = new Reis(false);
        VervoerStrategy vervoer = new FietsVervoerStrategy();
        mijnReis.simuleerReis(vervoer);
        System.out.println("");

        System.out.println("Tijdens de spits");
        mijnReis.setSpits(true);
        mijnReis.simuleerReis(vervoer);                   // Met fiets
        mijnReis.simuleerReis(new AutoVervoerStrategy()); // Met auto
        mijnReis.simuleerReis(new OVVervoerStrategy());   // Met OV
        System.out.println("");

        System.out.println("Met <nieuw> vervoer (Stap 2)  ");
        mijnReis.setSpits(true);
        mijnReis.simuleerReis(vervoer);                   // Met fiets
        mijnReis.simuleerReis(new AutoVervoerStrategy()); // Met auto
        mijnReis.simuleerReis(new OVVervoerStrategy());
        mijnReis.simuleerReis(new AchterOpEenEzelBijEenMexicaanMetEenPonchoEnEenSombrero());
        System.out.println("");

        System.out.println("Met <nieuw> vervoer, lambda edition! (Stap 5)");
        mijnReis.setSpits(false);
        VervoerStrategy fiets = (spits) -> 40;
        VervoerStrategy auto = (spits) -> spits ? 30 : 60;
        VervoerStrategy OV = (spits) -> { Random randomNumberGenerator = new Random();
            return randomNumberGenerator.nextInt(90);};
        VervoerStrategy AchterOpEenEzelBijEenMexicaanMetEenPonchoEnEenSombrero = (spits) -> spits ? 256 : 25;
        VervoerStrategy Teleportatie = (spits) -> 0;

        System.out.println("Op de fiets:");
        mijnReis.simuleerReis(fiets);
        System.out.println("met de Auto:");
        mijnReis.simuleerReis(auto);
        System.out.println("Met het OV:");
        mijnReis.simuleerReis(OV);
        System.out.println("Op de ezel:");
        mijnReis.simuleerReis(AchterOpEenEzelBijEenMexicaanMetEenPonchoEnEenSombrero);
        System.out.println("Teleportatie:");
        mijnReis.simuleerReis(Teleportatie);
        System.out.println("");    }
}