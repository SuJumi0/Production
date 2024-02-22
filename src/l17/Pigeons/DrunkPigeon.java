package l17.Pigeons;

import l17.Pigeons.Pigeons;

public class DrunkPigeon implements Pigeons {

    public DrunkPigeon(String drunkPigeon) {
    }

    @Override
    public void sleep() {
        System.out.println("Хсююю Хсююю");
    }

    @Override
    public void vandalize() {
        System.out.println("DrunkPigeon: Эй коты! Хорош напрягаться. пойдём в соседний район кутить!");

    }

    @Override
    public void makeSound() {
        System.out.println("Гурл Гурл.");
    }

    @Override
    public void dancing() {
        System.out.println("DrunkPigeon: Пусть коты танцуют!");

    }
}