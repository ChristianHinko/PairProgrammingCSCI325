/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csu.csci325;

import java.util.Scanner;

/**
 *
 * @author Nathan Mixon
 * @co-author Christian Hinkle
 */

public class Vehicle 
{
    // encapsulation of hidden (protected) members but we have public methods handling them
    protected String name;
    protected int speed;
    
    public Vehicle()
    {
        name = "None";
        speed = 0;
    }
    public Vehicle(String vehicleName) // contructor overloading (polymorphism)
    {
        name = vehicleName;
        speed = 0;
    }
    public Vehicle(String vehicleName, int vehicleSpeed) // contructor overloading (polymorphism)
    {
        name = vehicleName;
        speed = vehicleSpeed;
    }
    
    public void PrintVehicle()
    {
        System.out.println("Vehicle name: " + name);
        System.out.println("Vehicle speed: " + speed);
    }
    
    
    // Public accessors for accessing encapsulated members:
    
    public String GetName()
    {
        return name;
    }
    public void SetName(String newName)
    {
        name = newName;
    }
    public void SetName(Scanner scanner)
    {
        System.out.println("Enter new name of vehicle: ");
        name = scanner.nextLine();
    }
    
    public int GetSpeed()
    {
        return speed;
    }
    public void SetSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
}
