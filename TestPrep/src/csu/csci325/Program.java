/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author Christian Hinkle, Nathan Mixon
 */
public class Program
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("TESTING PARAMETERIZED CONSTRUCTORS:");
        
        // test A
        Vehicle scooter = new Vehicle("Scooter", 500);
        
        // test B
        Car jeep = new Car("Jeep", "Wrangler", "2007", 501);
        
        // test C: PrintVehicle() the Vehicle's base implementation
        scooter.PrintVehicle();
        
        System.out.println("");
        
        // test D: Ensure that the Car's overriden PrintVehicle() method gets called
        // rather than the Vehicle's base implementation. (Testing polymorphism with
        // overriding)
        jeep.PrintVehicle();
        
        System.out.println("");
        System.out.println("");
        System.out.println("TESTING SETTERS:");
        
        // test E: Test our SetSpeed function on our Vehicle
        System.out.println("                before SetSpeed():");
        scooter.PrintVehicle();
        System.out.println("");
        scooter.SetSpeed(30);
        System.out.println("                after SetSpeed():");
        scooter.PrintVehicle();
        
        System.out.println("");
        
        // test F: Test our SetModel function on our Car
        System.out.println("                before SetModel():");
        jeep.PrintVehicle();
        jeep.SetModel("Cherokee");
        System.out.println("                after SetModel():");
        jeep.PrintVehicle();
        System.out.println("");
        
        
        // Default constructors:
        
        // These contructors should initialize our variables
        // test G
        Vehicle defaultVehicle = new Vehicle();
        // test H
        Car defaultCar = new Car();
        
        System.out.println("");
        System.out.println("");
        System.out.println("TESTING DEFAULT CONSTRUCTORS:");
        
        defaultVehicle.PrintVehicle();
        
        System.out.println("");
        
        defaultCar.PrintVehicle();
    }
}
