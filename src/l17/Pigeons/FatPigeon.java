package l17.Pigeons;

public class FatPigeon implements Pigeons {

    public FatPigeon(String fatPigeon) {
    }

    @Override
    public void sleep() {
        System.out.println("Хуррррр Хурррр.");
    }

    @Override
    public void vandalize() {
        System.out.println("Толстый голубь, кидает семечки в прохожих.");

    }

    @Override
    public void makeSound() {
        System.out.println("Курлык Курлык");
    }

    @Override
    public void dancing() {
        System.out.println("Толстый голубь просто танцует.");

    }
}