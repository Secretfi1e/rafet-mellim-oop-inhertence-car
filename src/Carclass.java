public class Carclass extends Vehicleclass {

    int FuelCapacity;

    public Carclass(String brand, String model, int millage, int fuelCapacity) {
        super(brand, model, millage);
        FuelCapacity = fuelCapacity;
    }

    public void AddFuel(int fuel) {
        if (fuel<=FuelCapacity) {
            System.out.println("Fuel was added!");

        }else System.out.println("Fuel was not added!");


    }
}
