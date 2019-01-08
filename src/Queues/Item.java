package Queues;

public class Item {

    Item next;
    String price;
    String itemName;
    int quantity;
    String size;

    public Item(String price, String itemName, String size)
    {
        this.price = price;
        this.itemName = itemName;
        this.size = size;
    }

    public Item()
    {}

    public String getPrice()
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
