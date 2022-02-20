public class Speakers extends MusicAccessories{
    public Speakers(String name, double buyPrice, double sellPrice) {
        super(name, buyPrice, sellPrice);
    }

    @Override
    public double calcMarkUp(Instrument instrument) {
        return instrument.getSellPrice() - instrument.getBuyPrice();
    }
}
