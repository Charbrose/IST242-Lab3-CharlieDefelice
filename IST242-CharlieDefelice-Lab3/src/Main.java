import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select database:");
        System.out.println("1. MySQL");
        System.out.println("2. MongoDB");
        System.out.println("3. Redis");
        System.out.println("4. Blockchain");

        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                // Perform MySQL CRUD operations
                break;
            case 2:
                // Perform MongoDB CRUD operations
                break;
            case 3:
                // Perform Redis CRUD operations
                break;
            case 4:
                // Perform Blockchain operations
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
