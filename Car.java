/**
 * This class represents a blueprint for creating Car objects.
 * It defines what a Car has (fields) and what a Car can do (methods).
 */
public class Car
{

    // Instance variables (data members)
    private String make;
    private int year;

    // Constructor - used to create Car objects
    public Car(String make, int year)
    {
        this.make = make;
        this.year = year;
    }

    // Method - behavior of a Car object
    public String getCarInfo()
    {
        return "Car Make: " + make + ", Year: " + year;
    }
}