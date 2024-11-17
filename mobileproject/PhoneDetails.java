package mobileproject;

public class PhoneDetails {
    private String brand;
    private String model;
    private String variant;
    private String color;
    private int price;

    public PhoneDetails(String brand, String model, String variant, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.variant = variant;
        this.color = color;
        this.price = price;
    }

    public void displaySpecifications() {
        System.out.println("==================================");
        System.out.println("Specification:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Variant: " + variant);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("===================================");
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
