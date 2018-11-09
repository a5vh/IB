package Queues;

public class Item {

    Item next;
    double price;
    String itemName;
    int quantity;

    public Item(double price, String itemName, int quantity)
    {
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
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
}
