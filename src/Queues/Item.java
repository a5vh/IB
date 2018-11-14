package Queues;

public class Item {

    Item next;
    double price;
    String itemName;
    int quantity;
    String size;

    public Item(double price, String itemName, String size)
    {
        this.price = price;
        this.itemName = itemName;
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

    //public String toString() {
      //  return this.getItemName();
    //}
}
