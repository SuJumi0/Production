package l17.Cats;

public class FatCat implements Cats {

    public FatCat(String fatCat) {
    }

    @Override
    public void sleep() {
        System.out.println("FatCat: Поели можно и поспать?");
    }

    @Override
    public void vandalize() {
        System.out.println("FatCat: Кто со мной кутить?");

    }

    @Override
    public void makeSound() {
        System.out.println("FatCat: Ты кто?");

    }
    @Override
    public void dancing() {
        System.out.println("Fatty зовёт всех танцевать.");

    }
}