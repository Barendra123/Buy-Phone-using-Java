package mobileproject;

public class PhoneExtraDetails {
    public static void displayMoreDetails(PhoneDetails phone) {
        System.out.println("More Details:");
        if (phone.getBrand().equals("Apple")) {
            System.out.println("Camera: " + (phone.getColor().equals("Black") ? "48MP" : "50MP"));
            System.out.println("OS: iOS 17");
            System.out.println("RAM: " + (phone.getColor().equals("Red") ? "12GB" : "8GB"));
        } else if (phone.getBrand().equals("Samsung")) {
            System.out.println("Camera: " + (phone.getColor().equals("Black") ? "108MP" : "50MP"));
            System.out.println("OS: Android 13");
            System.out.println("RAM: " + (phone.getColor().equals("Black") ? "12GB" : "8GB"));
        }
    }
}
