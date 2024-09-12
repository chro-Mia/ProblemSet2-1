import java.util.Scanner;
public class RestaurantRunner
{
    public static void main (String[] args){

        Menu menu = new Menu("Dollar Burger");

        menu.addItem("Burger", 1);
        menu.addItem("Fries", 1);
        menu.addItem("Drink", 1);

        System.out.println(menu);

        Scanner input = new Scanner(System.in);

        boolean willThatBeAll = false;
        Order order = new Order(menu);

        while(!willThatBeAll) {
            System.out.println("What would you like to order?: ");
            int index = input.nextInt();

            System.out.println("How many do you want?: ");
            int amount = input.nextInt();

            order.add(index, amount);

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
