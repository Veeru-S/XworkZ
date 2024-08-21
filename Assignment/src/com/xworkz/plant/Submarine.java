package com.xworkz.plant;

public class Submarine {
    private String name;
    private String type;
    private double length;
    private double displacement;
    private int crew;
    private String propulsionType;
    private double maxSpeed;
    private double depth;
    private String hullMaterial;
    private double weight;
    private int range;
    private boolean isNuclearPowered;
    private String countryOfOrigin;
    private int torpedoCount;
    private String radarType;
    private double sonarRange;
    private int missileCount;
    private double endurance;
    private String color;
    private int constructionYear;
    private int numberOfDecks;
    private String manufacturer;
    private boolean hasStealthTechnology;
    private String electronicWarfareSystem;
    private double fuelCapacity;
    private String communicationSystem;
    private String periscopeType;
    private double width;
    private int compartments;
    private String armamentType;
    private boolean isOperational;
    private double height;
    private int escapeHatchCount;
    private String radarSignature;
    private double enginePower;
    private boolean hasEscapePod;
    private double batteryCapacity;
    private String sonarType;
    private boolean hasMineLayingCapability;
    private double lifeSupportDuration;

    // Constructor initializing 5 instance variables
    public Submarine(String name, String type, double length, double displacement, int crew) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.displacement = displacement;
        this.crew = crew;
    }

    // Methods to set the remaining 35 instance variables
    public void setPropulsionType(String propulsionType) { this.propulsionType = propulsionType; }
    public void setMaxSpeed(double maxSpeed) { this.maxSpeed = maxSpeed; }
    public void setDepth(double depth) { this.depth = depth; }
    public void setHullMaterial(String hullMaterial) { this.hullMaterial = hullMaterial; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setRange(int range) { this.range = range; }
    public void setIsNuclearPowered(boolean isNuclearPowered) { this.isNuclearPowered = isNuclearPowered; }
    public void setCountryOfOrigin(String countryOfOrigin) { this.countryOfOrigin = countryOfOrigin; }
    public void setTorpedoCount(int torpedoCount) { this.torpedoCount = torpedoCount; }
    public void setRadarType(String radarType) { this.radarType = radarType; }
    public void setSonarRange(double sonarRange) { this.sonarRange = sonarRange; }
    public void setMissileCount(int missileCount) { this.missileCount = missileCount; }
    public void setEndurance(double endurance) { this.endurance = endurance; }
    public void setColor(String color) { this.color = color; }
    public void setConstructionYear(int constructionYear) { this.constructionYear = constructionYear; }
    public void setNumberOfDecks(int numberOfDecks) { this.numberOfDecks = numberOfDecks; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setHasStealthTechnology(boolean hasStealthTechnology) { this.hasStealthTechnology = hasStealthTechnology; }
    public void setElectronicWarfareSystem(String electronicWarfareSystem) { this.electronicWarfareSystem = electronicWarfareSystem; }
    public void setFuelCapacity(double fuelCapacity) { this.fuelCapacity = fuelCapacity; }
    public void setCommunicationSystem(String communicationSystem) { this.communicationSystem = communicationSystem; }
    public void setPeriscopeType(String periscopeType) { this.periscopeType = periscopeType; }
    public void setWidth(double width) { this.width = width; }
    public void setCompartments(int compartments) { this.compartments = compartments; }
    public void setArmamentType(String armamentType) { this.armamentType = armamentType; }
    public void setIsOperational(boolean isOperational) { this.isOperational = isOperational; }
    public void setHeight(double height) { this.height = height; }
    public void setEscapeHatchCount(int escapeHatchCount) { this.escapeHatchCount = escapeHatchCount; }
    public void setRadarSignature(String radarSignature) { this.radarSignature = radarSignature; }
    public void setEnginePower(double enginePower) { this.enginePower = enginePower; }
    public void setHasEscapePod(boolean hasEscapePod) { this.hasEscapePod = hasEscapePod; }
    public void setBatteryCapacity(double batteryCapacity) { this.batteryCapacity = batteryCapacity; }
    public void setSonarType(String sonarType) { this.sonarType = sonarType; }
    public void setHasMineLayingCapability(boolean hasMineLayingCapability) { this.hasMineLayingCapability = hasMineLayingCapability; }
    public void setLifeSupportDuration(double lifeSupportDuration) { this.lifeSupportDuration = lifeSupportDuration; }

    // Method to print the instance variables
    public void printSubmarineDetails() {
        System.out.println("Submarine [Name: " + name + ", Type: " + type + ", Length: " + length + "m, Displacement: " + displacement + " tons, Crew: " + crew +
                ", Propulsion Type: " + propulsionType + ", Max Speed: " + maxSpeed + " knots, Depth: " + depth + "m, Hull Material: " + hullMaterial +
                ", Weight: " + weight + " tons, Range: " + range + " nautical miles, Is Nuclear Powered: " + isNuclearPowered + ", Country Of Origin: " + countryOfOrigin +
                ", Torpedo Count: " + torpedoCount + ", Radar Type: " + radarType + ", Sonar Range: " + sonarRange + "km, Missile Count: " + missileCount +
                ", Endurance: " + endurance + " days, Color: " + color + ", Construction Year: " + constructionYear + ", Number Of Decks: " + numberOfDecks +
                ", Manufacturer: " + manufacturer + ", Has Stealth Technology: " + hasStealthTechnology + ", Electronic Warfare System: " + electronicWarfareSystem +
                ", Fuel Capacity: " + fuelCapacity + " liters, Communication System: " + communicationSystem + ", Periscope Type: " + periscopeType +
                ", Width: " + width + "m, Compartments: " + compartments + ", Armament Type: " + armamentType + ", Is Operational: " + isOperational +
                ", Height: " + height + "m, Escape Hatch Count: " + escapeHatchCount + ", Radar Signature: " + radarSignature + ", Engine Power: " + enginePower +
                ", Has Escape Pod: " + hasEscapePod + ", Battery Capacity: " + batteryCapacity + "kWh, Sonar Type: " + sonarType +
                ", Has Mine Laying Capability: " + hasMineLayingCapability + ", Life Support Duration: " + lifeSupportDuration + " days]");
    }

}
