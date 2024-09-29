import java.util.Scanner;
public class Main // class Main
{
    public static void main(String[] args) // main
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0; // itemPrice = 0
        String trash = "";
        System.out.print("Enter the item price in dollars: "); // output "Enter the item price: "
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();
            double shippingCost = 0;
            double totalCost = 0;
            if (!(itemPrice >= 100)) // if itemPrice < 100 then..
                                    //      output "The shipping cost in dollars is: " + shippingCost
                                    //      output "The total cost in dollars is: " + totalCost
            {
                shippingCost = 0.02 * itemPrice;
                totalCost = shippingCost + itemPrice;
                System.out.println("The shipping cost in dollars is: " + shippingCost);
                System.out.println("The total cost in dollars is: " + totalCost);
            }
            else // else
                        // output "The shipping cost in dollars is: " + shippingCost
                        // output "The total cost in dollars is: " + totalCost
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

    } // return
} // end class