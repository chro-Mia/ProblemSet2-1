import java.util.Scanner;
public class RestaurantRunner
{
    public static void main (String[] args){

        //create menu object
        Menu menu = new Menu("Dollar Burger");

        //add menu items
        menu.addItem("Burger", 1);
        menu.addItem("Fries", 1);
        menu.addItem("Drink", 1);

        //print out menu
        System.out.println(menu);

        Scanner input = new Scanner(System.in);

        //hilarious variable name
        boolean willThatBeAll = false;

        //string for formatting
        String other = "";

        //create new order
        Order order = new Order(menu);

        //while the customer is still ordering
        //take their input and add their items to the order
        //if they're done ordering, calculate their total and ask if they have enough
        //also i cant tell if i should edit the order class or just add the extra logic here?
        while(!willThatBeAll) {
            System.out.println("What " + other + "would you like to order?: ");
            int index = input.nextInt();

            System.out.println("How many do you want?: ");
            int amount = input.nextInt();

            order.add(index, amount);
            other = "else ";

            System.out.println("Will that be all?: ");
            willThatBeAll = input.nextBoolean();
            if(willThatBeAll){
                System.out.println("You ordered: " + order);
                System.out.println("Your total is: " + order.getTotal());

                System.out.println("How much money do you have?");
                double money = input.nextDouble();

                if(money >= order.getTotal()){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your change is " + (money - order.getTotal()));
                }
                else{
                    System.out.println("You don't have enough money.");
                }
            }
        }
    }
}