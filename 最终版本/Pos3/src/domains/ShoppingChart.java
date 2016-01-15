package domains;

import java.util.ArrayList;


public class ShoppingChart {
    private ArrayList<Item> items = new ArrayList<Item>();

    public ShoppingChart(){}

    public void add(Item item) {
        this.items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
