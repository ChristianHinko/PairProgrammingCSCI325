/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author Christian Hinkle
 */
public class Car extends Vehicle
{
    private String model;
    private String year;
    
    
    public Car(String carModel, String carYear)
    {
        model = carModel;
        year = carYear;
    }
    
    @Override
    public void PrintVehicle()
    {
        super.PrintVehicle();
        
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }
    
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
