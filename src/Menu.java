import java.util.ArrayList;

public class Menu
{
    private String restaurant;
    private ArrayList<Item> menuItems;

    public Menu(String restaurantName)
    {
        restaurant = restaurantName;
        menuItems = new ArrayList<Item>();
    }

    public void addItem(String itemName, double price)
    {
        menuItems.add(new Item(itemName, price));
    }

    public void removeItem(String itemName)
    {
        for (int i = 0; i < menuItems.size(); i++)
        {
            if (menuItems.get(i).getName().equals(itemName))
            {
                menuItems.remove(i);
                break;
            }
        }

    }

    public Item getItem(int itemMenuNumber)
    {
        return menuItems.get(itemMenuNumber);
    }

    public ArrayList<Item> getMenuItems()
    {
        return menuItems;
    }

    public String toString()
    {
        String str = restaurant.toString();
        for (int i = 0; i < restaurant.length(); i++)
        {
            str += "-";
        }
        str += "\nItem #\tName\tPrice\n";
        for (int i = 0; i < menuItems.size(); i++)
        {
            str += i + "\t" + menuItems.get(i).toString() + "\n";
        }
        return str;
    }
}