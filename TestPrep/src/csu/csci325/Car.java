/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author Christian Hinkle
 * @co-author Nathan Mixon
 */
public class Car extends Vehicle
{
    private String model;
    private String year;
    
    
    public Car()
    {
        name = "None";
        speed = 0;
        model = "None";
        year = "None";
    }
    public Car(String carMake, String carModel, String carYear) // contructor overloading (polymorphism)
    {
        name = carMake;
        speed = 0;
        model = carModel;
        year = carYear;
    }
    public Car(String carMake, String carModel, String carYear, int carSpeed) // contructor overloading (polymorphism)
    {
        name = carMake;
        model = carModel;
        year = carYear;
        speed = carSpeed;
    }
    
    @Override
    public void PrintVehicle() // function overriding (polymorphism)
    {
        super.PrintVehicle();
        
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }
    
    
    // Public accessors for accessing encapsulated members:
    
    public String GetModel()
    {
        return model;
    }
    public void SetModel(String newModel)
    {
        model = newModel;
    }
    
    public String GetYear()
    {
        return year;
    }
    public void SetYear(String newYear)
    {
        year = newYear;
    }
}
