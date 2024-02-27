import java.util.Scanner;

public class Task6
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

        System.out.printf("Num1: ");
        double num1 = getNumber();

        System.out.printf("Num2: ");
        double num2 = getNumber();

        if (num1 < num2)
        {
            System.out.println("Num1 less");
        }

        else if (num1 > num2)
        {
            System.out.println("Num2 greater");
        }

        else {
            System.out.println("Equal");
        }
    }
}
