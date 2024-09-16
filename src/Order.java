public class Order
{
    private final int[] orderCodes;
    private Menu restaurant;

    public Order(Menu restaurantName)
    {

        restaurant = restaurantName;
        orderCodes = new int[restaurant.getMenuItems().size()];
    }

    public void add(int menuItemNumber, int quantity)
    {
        orderCodes[menuItemNumber] += quantity;
    }

    public double getTotal()
    {
        double total = 0.0;
        for (int i = 0; i < orderCodes.length; i++)
        {
            total += orderCodes[i] * restaurant.getMenuItems().get(i).getPrice();
        }
        return total;
    }

    public String toString()
    {
        String str = "Quant\tDescription\n";
        for (int i = 0; i < orderCodes.length; i++)
        {
            if (orderCodes[i] != 0)
            {
                str += orderCodes[i] + "\t" + restaurant.getMenuItems().get(i).toString() + "\n";
            }
        }
        // For Problem C, add code so that the order total will
        // be added to the String that gets returned.


        return str;
    }
}