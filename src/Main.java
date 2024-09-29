import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        String trash = "";
        System.out.print("Enter the item price in dollars: ");
        if(in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
            double shippingCost = 0;
            double totalCost = 0;
            if (!(itemPrice >= 100))
            {
                shippingCost = 0.02 * itemPrice;
                totalCost = shippingCost + itemPrice;
                System.out.println("The shipping cost in dollars is: " + shippingCost);
                System.out.println("The total cost in dollars is: " + totalCost);
            }
            else
            {
              shippingCost = 0;
              totalCost = itemPrice;
                System.out.println("The shipping cost in dollars is: " + shippingCost);
                System.out.println("The total cost in dollars is: " + totalCost);
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said your item price was " + trash);
            System.out.println("Run the program again and enter a valid number");
        }

    }
}