package mobileproject;

import java.util.Scanner;

public class UserInputHandler {
    private Scanner scanner;

    public UserInputHandler() {
        scanner = new Scanner(System.in);
    }

    public String getUserChoice(String question, String validOptions) {
        String choice;
        while (true) {
            System.out.println(question);
            choice = scanner.nextLine();
            if (validOptions.contains(choice)) {
                break;
            } else {
                System.out.println("Please enter a valid option: " + validOptions);
            }
        }
        return choice;
    }

    public String getModel(String brand) {
        String model;
        while (true) {
            System.out.println("Which model?");
            if (brand.equalsIgnoreCase("Samsung")) {
                System.out.println("1. Galaxy S23 Ultra\n2. Galaxy Note 20");
                model = getUserChoice("Choose 1 or 2", "1 2");
                model = model.equals("1") ? "Galaxy S23 Ultra" : "Galaxy Note 20";
                break;
            } else {
                System.out.println("1. iPhone 15 Pro\n2. iPhone 16 Pro");
                model = getUserChoice("Choose 1 or 2", "1 2");
                model = model.equals("1") ? "iPhone 15 Pro" : "iPhone 16 Pro";
                break;
            }
        }
        return model;
    }

    public String getVariant() {
        return getUserChoice("Which variant? (128GB/256GB/512GB)", "128GB 256GB 512GB");
    }

    public String getColor() {
        return getUserChoice("Which color? (Black/White/Red)", "Black White Red");
    }

    public void closeScanner() {
        scanner.close();
    }
}
