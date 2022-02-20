public abstract class MusicAccessories implements ISell {
    private String name;
    private double buyPrice;
    private double sellPrice;

    public MusicAccessories(String name, double buyPrice, double sellPrice) {
    }

    public String getName() {
        return name;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
