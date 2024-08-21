package com.xworkz.plant;

public class Ball {
    private String brand;
    private String type;
    private int diameter;
    private String color;
    private String material;
    private String countryOfOrigin;
    private double weight;
    private boolean isInflatable;
    private double price;
    private boolean isUsed;
    private String sport;
    private int bounceHeight;
    private String surfaceType;
    private int durability;
    private String texture;
    private boolean isWaterResistant;
    private boolean isOfficialSize;
    private int warrantyPeriod;
    private String manufacturer;
    private boolean isCustomizable;
    private int productionYear;
    private boolean isEcoFriendly;
    private String certification;
    private int stockCount;
    private boolean isInStock;

    // Constructor initializing 8 instance variables
    public Ball(String brand, String type, int diameter, String color, String material, String countryOfOrigin, double weight, boolean isInflatable) {
        this.brand = brand;
        this.type = type;
        this.diameter = diameter;
        this.color = color;
        this.material = material;
        this.countryOfOrigin = countryOfOrigin;
        this.weight = weight;
        this.isInflatable = isInflatable;
    }

    // Methods to set the remaining 17 instance variables
    public void setPrice(double price) { this.price = price; }
    public void setIsUsed(boolean isUsed) { this.isUsed = isUsed; }
    public void setSport(String sport) { this.sport = sport; }
    public void setBounceHeight(int bounceHeight) { this.bounceHeight = bounceHeight; }
    public void setSurfaceType(String surfaceType) { this.surfaceType = surfaceType; }
    public void setDurability(int durability) { this.durability = durability; }
    public void setTexture(String texture) { this.texture = texture; }
    public void setIsWaterResistant(boolean isWaterResistant) { this.isWaterResistant = isWaterResistant; }
    public void setIsOfficialSize(boolean isOfficialSize) { this.isOfficialSize = isOfficialSize; }
    public void setWarrantyPeriod(int warrantyPeriod) { this.warrantyPeriod = warrantyPeriod; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setIsCustomizable(boolean isCustomizable) { this.isCustomizable = isCustomizable; }
    public void setProductionYear(int productionYear) { this.productionYear = productionYear; }
    public void setIsEcoFriendly(boolean isEcoFriendly) { this.isEcoFriendly = isEcoFriendly; }
    public void setCertification(String certification) { this.certification = certification; }
    public void setStockCount(int stockCount) { this.stockCount = stockCount; }
    public void setIsInStock(boolean isInStock) { this.isInStock = isInStock; }

    // Method to print the instance variables
    public void printBallDetails() {
        System.out.println("Ball [Brand: " + brand + ", Type: " + type + ", Diameter: " + diameter + "cm, Color: " + color + ", Material: " + material +
                ", Country Of Origin: " + countryOfOrigin + ", Weight: " + weight + "g, Is Inflatable: " + isInflatable + ", Price: $" + price +
                ", Is Used: " + isUsed + ", Sport: " + sport + ", Bounce Height: " + bounceHeight + "cm, Surface Type: " + surfaceType +
                ", Durability: " + durability + " years, Texture: " + texture + ", Is Water Resistant: " + isWaterResistant +
                ", Is Official Size: " + isOfficialSize + ", Warranty Period: " + warrantyPeriod + " months, Manufacturer: " + manufacturer +
                ", Is Customizable: " + isCustomizable + ", Production Year: " + productionYear + ", Is Eco Friendly: " + isEcoFriendly +
                ", Certification: " + certification + ", Stock Count: " + stockCount + ", Is In Stock: " + isInStock + "]");
    }

}
