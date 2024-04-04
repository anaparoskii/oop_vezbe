package vezbe5;

import java.util.Scanner;

public class Faculty {
    static boolean exit = false;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("""
                    --- FACULTY ---
                    [0] Exit application
                    [1] Work with Classes
                    [2] Work with Students
                    [3] Work with Professors
                    """);
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    ClassesMenu.workWithClasses();
                    break;
                case 2:
                    // something else
                    break;
                case 3:
                    // something completely different
                    break;
                default:
                    System.out.println("Invalid choice!!! Try again!");
            }
        } while (!exit);
    }

}
