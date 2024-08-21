package com.xworkz.plant;

public class Main {
    public static void main(String[] args) {
        // Creating 3 instances of each class
        Plant plant1 = new Plant("Rose", "Flower", 50, 2, true);
        Plant plant2 = new Plant("Cactus", "Succulent", 40, 5, false);
        Plant plant3 = new Plant("Oak", "Tree", 500, 100, true);

        plant1.setColor("Red");
        plant1.setOrigin("Asia");
        plant1.setLeavesCount(15);
        plant1.setIsIndoor(false);
        plant1.setSeason("Spring");

        plant2.setColor("Green");
        plant2.setOrigin("Africa");
        plant2.setLeavesCount(5);
        plant2.setIsIndoor(true);
        plant2.setSeason("Summer");

        plant3.setColor("Brown");
        plant3.setOrigin("Europe");
        plant3.setLeavesCount(1000);
        plant3.setIsIndoor(false);
        plant3.setSeason("Autumn");

        Ball ball1 = new Ball("Nike", "Soccer", 22, "White", "Leather", "USA", 450, true);
        Ball ball2 = new Ball("Adidas", "Basketball", 24, "Orange", "Synthetic", "China", 500, false);
        Ball ball3 = new Ball("Spalding", "Tennis", 6, "Yellow", "Rubber", "Germany", 60, true);

        ball1.setPrice(29.99);
        ball1.setIsUsed(false);
        ball1.setSport("Soccer");
        ball1.setBounceHeight(120);
        ball1.setSurfaceType("Grass");
        ball1.setDurability(2);
        ball1.setTexture("Smooth");
        ball1.setIsWaterResistant(true);
        ball1.setIsOfficialSize(true);
        ball1.setWarrantyPeriod(12);
        ball1.setManufacturer("Nike Inc.");
        ball1.setIsCustomizable(true);
        ball1.setProductionYear(2023);
        ball1.setIsEcoFriendly(true);
        ball1.setCertification("FIFA Approved");
        ball1.setStockCount(100);
        ball1.setIsInStock(true);

        ball2.setPrice(34.99);
        ball2.setIsUsed(true);
        ball2.setSport("Basketball");
        ball2.setBounceHeight(90);
        ball2.setSurfaceType("Hardwood");
        ball2.setDurability(1);
        ball2.setTexture("Grippy");
        ball2.setIsWaterResistant(false);
        ball2.setIsOfficialSize(true);
        ball2.setWarrantyPeriod(6);
        ball2.setManufacturer("Adidas AG");
        ball2.setIsCustomizable(false);
        ball2.setProductionYear(2021);
        ball2.setIsEcoFriendly(false);
        ball2.setCertification("NBA Approved");
        ball2.setStockCount(50);
        ball2.setIsInStock(false);

        ball3.setPrice(9.99);
        ball3.setIsUsed(false);
        ball3.setSport("Tennis");
        ball3.setBounceHeight(200);
        ball3.setSurfaceType("Clay");
        ball3.setDurability(5);
        ball3.setTexture("Fuzzy");
        ball3.setIsWaterResistant(false);
        ball3.setIsOfficialSize(true);
        ball3.setWarrantyPeriod(3);
        ball3.setManufacturer("Spalding");
        ball3.setIsCustomizable(false);
        ball3.setProductionYear(2022);
        ball3.setIsEcoFriendly(true);
        ball3.setCertification("ITF Approved");
        ball3.setStockCount(200);
        ball3.setIsInStock(true);

        Submarine sub1 = new Submarine("Nautilus", "Attack", 70.5, 7000, 100);
        Submarine sub2 = new Submarine("Typhoon", "Ballistic", 175.0, 24000, 160);
        Submarine sub3 = new Submarine("Scorpion", "Hunter-Killer", 90.0, 8500, 120);

        sub1.setPropulsionType("Nuclear");
        sub1.setMaxSpeed(30);
        sub1.setDepth(400);
        sub1.setHullMaterial("Steel");
        sub1.setWeight(7000);
        sub1.setRange(12000);
        sub1.setIsNuclearPowered(true);
        sub1.setCountryOfOrigin("USA");
        sub1.setTorpedoCount(20);
        sub1.setRadarType("Active Sonar");
        sub1.setSonarRange(50);
        sub1.setMissileCount(12);
        sub1.setEndurance(90);
        sub1.setColor("Black");
        sub1.setConstructionYear(1980);
        sub1.setNumberOfDecks(2);
        sub1.setManufacturer("Electric Boat Company");
        sub1.setHasStealthTechnology(true);
        sub1.setElectronicWarfareSystem("Advanced");
        sub1.setFuelCapacity(50000);
        sub1.setCommunicationSystem("Satellite");
        sub1.setPeriscopeType("Digital");
        sub1.setWidth(10);
        sub1.setCompartments(8);
        sub1.setArmamentType("Torpedo");
        sub1.setIsOperational(true);
        sub1.setHeight(20);
        sub1.setEscapeHatchCount(4);
        sub1.setRadarSignature("Low");
        sub1.setEnginePower(30000);
        sub1.setHasEscapePod(true);
        sub1.setBatteryCapacity(1000);
        sub1.setSonarType("Passive");
        sub1.setHasMineLayingCapability(false);
        sub1.setLifeSupportDuration(90);

        sub2.setPropulsionType("Diesel-Electric");
        sub2.setMaxSpeed(25);
        sub2.setDepth(500);
        sub2.setHullMaterial("Titanium");
        sub2.setWeight(24000);
        sub2.setRange(15000);
        sub2.setIsNuclearPowered(false);
        sub2.setCountryOfOrigin("Russia");
        sub2.setTorpedoCount(16);
        sub2.setRadarType("Bistatic Sonar");
        sub2.setSonarRange(60);
        sub2.setMissileCount(20);
        sub2.setEndurance(120);
        sub2.setColor("Blue");
        sub2.setConstructionYear(1985);
        sub2.setNumberOfDecks(3);
        sub2.setManufacturer("Sevmash");
        sub2.setHasStealthTechnology(true);
        sub2.setElectronicWarfareSystem("Intermediate");
        sub2.setFuelCapacity(60000);
        sub2.setCommunicationSystem("HF Radio");
        sub2.setPeriscopeType("Optical");
        sub2.setWidth(12);
        sub2.setCompartments(10);
        sub2.setArmamentType("ICBM");
        sub2.setIsOperational(true);
        sub2.setHeight(24);
        sub2.setEscapeHatchCount(6);
        sub2.setRadarSignature("Very Low");
        sub2.setEnginePower(35000);
        sub2.setHasEscapePod(true);
        sub2.setBatteryCapacity(1500);
        sub2.setSonarType("Active");
        sub2.setHasMineLayingCapability(true);
        sub2.setLifeSupportDuration(120);

        sub3.setPropulsionType("Electric");
        sub3.setMaxSpeed(20);
        sub3.setDepth(300);
        sub3.setHullMaterial("Aluminum");
        sub3.setWeight(8500);
        sub3.setRange(8000);
        sub3.setIsNuclearPowered(false);
        sub3.setCountryOfOrigin("UK");
        sub3.setTorpedoCount(10);
        sub3.setRadarType("Monostatic Sonar");
        sub3.setSonarRange(40);
        sub3.setMissileCount(8);
        sub3.setEndurance(60);
        sub3.setColor("Gray");
        sub3.setConstructionYear(1990);
        sub3.setNumberOfDecks(2);
        sub3.setManufacturer("BAE Systems");
        sub3.setHasStealthTechnology(false);
        sub3.setElectronicWarfareSystem("Basic");
        sub3.setFuelCapacity(40000);
        sub3.setCommunicationSystem("UHF Radio");
        sub3.setPeriscopeType("Analog");
        sub3.setWidth(9);
        sub3.setCompartments(7);
        sub3.setArmamentType("Torpedo");
        sub3.setIsOperational(false);
        sub3.setHeight(18);
        sub3.setEscapeHatchCount(3);
        sub3.setRadarSignature("Moderate");
        sub3.setEnginePower(25000);
        sub3.setHasEscapePod(false);
        sub3.setBatteryCapacity(800);
        sub3.setSonarType("Hybrid");
        sub3.setHasMineLayingCapability(false);
        sub3.setLifeSupportDuration(60);

        // Creating an array to store all instances
        Object[] objects = {plant1, plant2, plant3, ball1, ball2, ball3, sub1, sub2, sub3};

        // Looping through the array and invoking the method to print the details
        for (Object obj : objects) {
            if (obj instanceof Plant) {
                ((Plant) obj).printPlantDetails();
            } else if (obj instanceof Ball) {
                ((Ball) obj).printBallDetails();
            } else if (obj instanceof Submarine) {
                ((Submarine) obj).printSubmarineDetails();
            }
        }
    }
}
