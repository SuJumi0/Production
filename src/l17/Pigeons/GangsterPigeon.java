package l17.Pigeons;

public class GangsterPigeon implements Pigeons {

    public GangsterPigeon (String gangsterPigeon) {
    }

    @Override
    public void sleep() {
        System.out.println("GangsterPigeon: Да сколько можно спать?? А ну подъём!!!.");
    }

    @Override
    public void vandalize() {
        System.out.println("В атаку!");

    }

    @Override
    public void makeSound() {
        System.out.println("GangsterPigeon: Эй коты! Вы из какого района будете???");
    }

    @Override
    public void dancing() {
        System.out.println("GangsterPigeon выплясывает ковырялочку.");

    }
}