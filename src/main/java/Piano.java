public class Piano extends Instrument{
    private int numberOfKeyPads;

    public Piano(String name, int buyPrice, int sellPrice, int numberOfKeyPads) {
        super(name, buyPrice, sellPrice);
        this.numberOfKeyPads = numberOfKeyPads;
    }
}
