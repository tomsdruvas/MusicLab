
import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public int getNumberOfItems() {
        return this.stock.size();
    }
}


