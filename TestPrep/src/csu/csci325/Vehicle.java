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
    private int speed;
    
    public Vehicle ()
    {
        speed = 0;
        
    }
    public Vehicle (int vehicleSpeed)
    {
        speed = vehicleSpeed;
        
    }
    public int GetSpeed()
    {
        return speed;
    }
    public void SetSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
    public void PrintVehicle()
    {
        System.out.println("Vehicle speed: " + speed);
    }
}
