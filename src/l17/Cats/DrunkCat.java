package l17.Cats;

public class DrunkCat implements Cats {

    public DrunkCat(String drunkCat) {
    }

    @Override
    public void sleep() {
        System.out.println("DrunkCat: Пойдём покемарим.");
    }

    @Override
    public void vandalize() {
        System.out.println("DrunkCat: Понеслась душа в рай!");

    }

    @Override
    public void makeSound() {
        System.out.println("DrunkCat: Щас спою!");
    }

    @Override
    public void dancing() {
        System.out.println("Drunky танцует, ХОП ХЕЙ.");

    }
}