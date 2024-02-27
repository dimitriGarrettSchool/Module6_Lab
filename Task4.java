import java.util.Scanner;

public class Task4
{
    private static String getString()
    {
        return in.nextLine();
    }

    private static Scanner in;

    public static void call()
    {
        in = new Scanner(System.in);

        System.out.printf("Input stuff: ");

        while (true)
        {
            if (in.hasNextInt())
            {
                System.out.println("Int: " + in.nextInt());

                return;
            }

            else if (in.hasNextDouble())
            {
                System.out.println("Double: " + in.nextDouble());

                return;
            }

            else {
                System.out.println("Invalid input (input a number): " + in.nextLine());
            }
        }
    }
}
