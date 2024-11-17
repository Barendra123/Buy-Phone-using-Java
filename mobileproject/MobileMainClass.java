package mobileproject;

public class MobileMainClass {

    public static void main(String[] args) {
        UserInputHandler inputHandler = new UserInputHandler();

        // Get phone choice
        String choice = inputHandler.getUserChoice("Do you want a phone? (Yes/No)", "Yes or No");

        if (choice.equalsIgnoreCase("Yes")) {
            // Get brand choice
            String brand = inputHandler.getUserChoice("Which Phone do you want? (Samsung/Apple)", "Samsung Apple");

            // Get model choice
            String model = inputHandler.getModel(brand);

            // Get variant choice
            String variant = inputHandler.getVariant();

            // Get color choice
            String color = inputHandler.getColor();

            // Calculate price
            int price = calculatePrice(brand, color);

            // Create PhoneDetails
            PhoneDetails phone = new PhoneDetails(brand, model, variant, color, price);

            // Display basic specifications
            PhoneDetailsProvider.displayBasicDetails(phone);

            // Display more details
            PhoneExtraDetails.displayMoreDetails(phone);
        } else {
            System.out.println("Thank you for interst! Have a great day!");
        }

        inputHandler.closeScanner();
    }

    private static int calculatePrice(String brand, String color) {
        if (brand.equalsIgnoreCase("Samsung")) {
            return color.equals("Black") ? 1099 : 999;
        } else { // Apple
            return color.equals("Black") ? 999 : 899;
        }
    }
}
