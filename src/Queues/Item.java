package Queues;

public class Item {

    Item next;
    double price;
    String itemName;
    int quantity;
    String size;

    public Item(double price, String itemName, int quantity, String size)
    {
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
        this.size = size;
    }

    public Item()
    {}

    public double getPrice()
    {
        return price;
    }

    public String getItemName()
    {
        return itemName;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getSize() { return size; }

    @Override
    public String toString() {
        return this.getItemName();
    }
}
