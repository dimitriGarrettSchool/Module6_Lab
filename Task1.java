import java.util.Scanner;

public class Task1
{
    private static double getNumber()
    {
        while (in.hasNextLine())
        {
            if (in.hasNextDouble())
            {
                return in.nextDouble();
            }

            else
            {
                System.out.println("Invalid input: " + in.nextLine());
            }
        }

        return 0;
    }

    private static Scanner in;

    public static void call()
    {
        in = new Scanner(System.in);

        System.out.println("What is the price: ");
        double price = getNumber();

        double shipping = price > 100 ? 0: price * 0.02;
        System.out.println("Price before shipping: " + price);
        System.out.println("Total price: " + (price + shipping));
    }
}
