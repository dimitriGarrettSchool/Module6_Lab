import java.util.Scanner;

public class Task5
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

        System.out.printf("Width: ");
        double width = getNumber();

        System.out.printf("Height: ");
        double height = getNumber();

        System.out.printf("Cost per square foot: ");
        double sqfeet = getNumber();

        System.out.println("Cost total: " + (sqfeet * width * height));
    }
}
