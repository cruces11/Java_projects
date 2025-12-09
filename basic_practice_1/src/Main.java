package ex_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringList list = new StringList();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n===== OPTION MENU =====");
            System.out.println("1. Add an element");
            System.out.println("2. Get an element by index");
            System.out.println("3. Search the index of an element");
            System.out.println("4. Delete an element by index");
            System.out.println("5. Show list");
            System.out.println("6. Show size");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            // read option safely
            option = scanner.nextInt();
            scanner.nextLine();  // clear buffer ← VERY IMPORTANT

            switch (option) {

                case 1:
                    System.out.print("Enter the text to add: ");
                    String toAdd = scanner.nextLine();
                    list.add(toAdd);
                    System.out.println("Added: \"" + toAdd + "\"");
                    break;

                case 2:
                    System.out.print("Enter the index: ");
                    int indexGet = scanner.nextInt();
                    scanner.nextLine(); // clear buffer

                    String value = list.get(indexGet);
                    if (value == null)
                        System.out.println("Invalid index.");
                    else
                        System.out.println("Element: " + value);
                    break;

                case 3:
                    System.out.print("Enter the text to search: ");
                    String search = scanner.nextLine();
                    int pos = list.indexOf(search);
                    System.out.println("Result: " + pos);
                    break;

                case 4:
                    System.out.print("Enter the index to delete: ");
                    int indexDel = scanner.nextInt();
                    scanner.nextLine(); // clear buffer

                    boolean deleted = list.delete(indexDel);
                    if (deleted)
                        System.out.println("Element deleted successfully.");
                    else
                        System.out.println("Invalid index.");
                    break;

                case 5:
                    System.out.println("List content:");
                    System.out.println(list);
                    break;

                case 6:
                    System.out.println("Current size: " + list.size());
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 0);

        scanner.close();
    }
}
