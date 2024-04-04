package vezbe5;

import java.util.Scanner;

public class ClassesMenu {
    static Scanner sc = new Scanner(System.in);
    public static void workWithClasses() {
        System.out.println("""
                --- CLASSES ---
                [0] Back
                [1] Add new class
                [2] Edit class
                [3] Delete class
                [4] List all classes
                [5] List specific class
                """);
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice) {
            case 0:
                break;
            case 1:
                ManageClasses.addClass();
                break;
            case 2:
                ManageClasses.editClass();
                break;
            case 3:
                ManageClasses.deleteClass();
                break;
            case 4:
                ManageClasses.listAllClasses();
                break;
            case 5:
                ManageClasses.listChosenClass();
                break;
            default:
                System.out.println("Invalid choice!!! Try again!");
        }
    }
}
