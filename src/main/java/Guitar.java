public class Guitar extends Instrument{
    private int numberOfString;

    public Guitar(String name, double buyPrice, double sellPrice, int numberOfString) {
        super(name, buyPrice, sellPrice);
        this.numberOfString = numberOfString;
    }

    @Override
    public double calcMarkUp(Instrument instrument) {
        return instrument.getBuyPrice() - instrument.getSellPrice();

    }
}
