/** Project: Lab3
 * Purpose Details: Integrates with SQL, MongoDB, and Redis databases, along with blockchain functionality
 * Course: IST 242
 * Author: Charlie Defelice
 * Date Developed: 2/16/24
 * Last Date Changed: 2/18/24
 * Rev: 2.2
 */

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
