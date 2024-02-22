package l17;

import l17.Cats.Cats;
import l17.Cats.DrunkCat;
import l17.Cats.FatCat;
import l17.Cats.GangsterCat;
import l17.Pigeons.DrunkPigeon;
import l17.Pigeons.FatPigeon;
import l17.Pigeons.GangsterPigeon;
import l17.Pigeons.Pigeons;

public class L17Main {
    public static void main(String[] args) {
        Cats cat1 = new DrunkCat("DrunkCat");
        Cats cat2 = new FatCat("FatCat");
        Cats cat3 = new GangsterCat("GangsterCat");

        Pigeons pigeon1 = new DrunkPigeon("DrunkPigeon");
        Pigeons pigeon2 = new FatPigeon("FatPigeon");
        Pigeons pigeon3 = new GangsterPigeon("GangsterPigeon");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();
        pigeon1.sleep();
        pigeon2.sleep();
        pigeon3.sleep();
        pigeon3.makeSound();
        cat3.makeSound();
        cat2.makeSound();
        pigeon1.makeSound();
        pigeon2.makeSound();
        cat3.vandalize();
        pigeon1.vandalize();
        pigeon2.vandalize();
        cat1.vandalize();
        cat1.makeSound();
        pigeon3.vandalize();
        cat2.dancing();
        cat1.dancing();
        cat3.dancing();
        pigeon3.dancing();
        pigeon1.dancing();
        pigeon2.dancing();




    }
}
