import java.util.Scanner;
public class RestaurantRunner
{
    public static void main (String[] args){

        //hilarious variable name
        boolean willThatBeAll = false;

        //string for formatting
        String other = "";

        //create menu object
        Menu menu = new Menu("Breakfast");
        menu.addItem("Pancakes", 1);
        menu.addItem("Waffles", 1);
        menu.addItem("Orange Juice", 1);

        Menu secondMenu = new Menu("Not Breakfast");
        secondMenu.addItem("Burger", 1);
        secondMenu.addItem("Fries", 1);
        secondMenu.addItem("Drink", 1);

        //print out menu
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Dollar Burger");
        System.out.println(menu);
        System.out.println(secondMenu);
        System.out.println("Would you like or order from the first or second menu?");
        int menuChoice = input.nextInt();
        Order order = new Order(menu);
        Order secondOrder = new Order(secondMenu);

        while(!willThatBeAll && menuChoice == 1) {

            System.out.println("What " + other + "would you like to order?: ");
            int index = input.nextInt();

            System.out.println("How many do you want?: ");
            int amount = input.nextInt();

            order.add(index, amount);
            other = "else ";

            System.out.println("Will that be all?: ");
            willThatBeAll = input.nextBoolean();

            if(willThatBeAll){
                //explicit toString() call
                String orderList = order.toString();

                System.out.println("You ordered:\n" + orderList);
                System.out.println("Your total is: " + order.getTotal());

                System.out.println("How much money do you have?");
                double money = input.nextDouble();

                if(money >= order.getTotal()){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your change is " + (money - order.getTotal()) + " dollars.");
                }
                else{
                    System.out.println("You don't have enough money.");
                }
            }
        }

        while(!willThatBeAll && menuChoice == 2) {

            System.out.println("What " + other + "would you like to order?: ");
            int index = input.nextInt();

            System.out.println("How many do you want?: ");
            int amount = input.nextInt();

            secondOrder.add(index, amount);
            other = "else ";

            System.out.println("Will that be all?: ");
            willThatBeAll = input.nextBoolean();

            if(willThatBeAll){
                //explicit toString() call
                String orderList = secondOrder.toString();

                System.out.println("You ordered:\n" + orderList);
                System.out.println("Your total is: " + secondOrder.getTotal());

                System.out.println("How much money do you have?");
                double money = input.nextDouble();

                if(money >= order.getTotal()){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your change is " + (money - secondOrder.getTotal()) + " dollars.");
                }
                else{
                    System.out.println("You don't have enough money.");
                }
            }
        }
    }
}