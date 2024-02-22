package l17.Cats;

public class GangsterCat implements Cats {

    public GangsterCat(String gangsterCat) {
    }

    @Override
    public void sleep() {
        System.out.println("Хрррр Хрррр...");
    }

    @Override
    public void vandalize() {
        System.out.println("GangsterCat: Что-то мне всё это не нравится...");

    }

    @Override
    public void makeSound() {
        System.out.println("GangsterCat: С того самого!");

    }

    @Override
    public void dancing() {
        System.out.println("туц туц туц туц туц...");

    }
}