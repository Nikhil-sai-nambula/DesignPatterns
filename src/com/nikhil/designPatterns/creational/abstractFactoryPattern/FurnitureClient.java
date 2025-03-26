package com.nikhil.designPatterns.creational.abstractFactoryPattern;
public class FurnitureClient {
    public static void main(String[] args) {
        // Choose a factory at runtime
        FurnitureFactory factory = new ModernFurnitureFactory(); // Or VictorianFurnitureFactory

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sitOn(); // Output: "Sitting on a modern chair."
        sofa.lieOn();  // Output: "Lying on a modern sofa."
    }
}