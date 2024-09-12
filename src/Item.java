public class Item
{
    private String name;
    private double price;

    public Item(String itemName, double itemPrice)
    {
        name = itemName;
        price = itemPrice;
    }

    public double getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name + "\t" + price;
    }
}