public class Guitar extends Instrument{
    private int numberOfString;

    public Guitar(String name, int buyPrice, int sellPrice, int numberOfString) {
        super(name, buyPrice, sellPrice);
        this.numberOfString = numberOfString;
    }
}
