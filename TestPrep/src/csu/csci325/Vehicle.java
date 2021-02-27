/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csu.csci325;

/**
 *
 * @author Nathan Mixon
 * @co-author Christian Hinkle
 */

public class Vehicle 
{
    private String name;
    private int speed;
    
    public Vehicle()
    {
        name = "None";
        speed = 0;
    }
    public Vehicle(String vehicleName)
    {
        name = vehicleName;
        speed = 0;
    }
    public Vehicle(String vehicleName, int vehicleSpeed)
    {
        name = vehicleName;
        speed = vehicleSpeed;
    }
    
    public void PrintVehicle()
    {
        System.out.println("Vehicle name: " + name);
        System.out.println("Vehicle speed: " + speed);
    }
    
    
    public String GetName()
    {
        return name;
    }
    public void SetName(String newName)
    {
        name = newName;
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
