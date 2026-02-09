/**
 * This class contains the main method.
 * It demonstrates the difference between a class and objects.
 */
public class Main
{

    public static void main(String[] args)
    {

        // Creating objects from the Car class
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2022);

        // Using object methods
        System.out.println(car1.getCarInfo());
        System.out.println(car2.getCarInfo());

        /*
         * Explanation:
         * - Car is the class (blueprint)
         * - car1 and car2 are objects created from the Car class
         * - Each object has its own data but uses the same class definition
         */
    }
}