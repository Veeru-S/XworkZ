package com.xworkz.plant;

public class Plant {
    // 10 instance variables
    private String name;
    private String type;
    private int height;
    private int age;
    private boolean hasFlowers;
    private String color;
    private String origin;
    private int leavesCount;
    private boolean isIndoor;
    private String season;

    // Constructor initializing 5 instance variables
    public Plant(String name, String type, int height, int age, boolean hasFlowers) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.age = age;
        this.hasFlowers = hasFlowers;
    }

    // Methods to set the remaining 5 instance variables
    public void setColor(String color) { this.color = color; }
    public void setOrigin(String origin) { this.origin = origin; }
    public void setLeavesCount(int leavesCount) { this.leavesCount = leavesCount; }
    public void setIsIndoor(boolean isIndoor) { this.isIndoor = isIndoor; }
    public void setSeason(String season) { this.season = season; }

    // Method to print the instance variables
    public void printPlantDetails() {
        System.out.println("Plant [Name: " + name + ", Type: " + type + ", Height: " + height + "cm, Age: " + age + " years, Has Flowers: " + hasFlowers +
                ", Color: " + color + ", Origin: " + origin + ", Leaves Count: " + leavesCount + ", Is Indoor: " + isIndoor + ", Season: " + season + "]");
    }
}
