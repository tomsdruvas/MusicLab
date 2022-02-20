public class Piano extends Instrument{
    private int numberOfKeyPads;

    public Piano(String name, double buyPrice, double sellPrice, int numberOfKeyPads) {
        super(name, buyPrice, sellPrice);
        this.numberOfKeyPads = numberOfKeyPads;
    }

    @Override
    public double calcMarkUp(Instrument instrument) {
        return instrument.getSellPrice() - instrument.getBuyPrice();
    }

    @Override
    public String playMusic(Instrument instrument) {
        return this.getName() + " is making piano sounds";
    }
}
